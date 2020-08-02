package org.mysql.conn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.mysql.conn.model.Address;
import org.mysql.conn.model.Emp;

//this is sql util class which we will use in other class to do sql operation
public class SqlUtil {

	private static Connection con = null;
	
	public static void connectionClose() {
		
		try {
			if(con!=null) {
				con.close();
				System.out.println("connection close successfully");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	
	public static void connectionOpen() {
		
		try{ 
			//here student is database name, root is username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");    
			
			if(con!=null){
				System.out.println("connected with mysql successfully");
			}
			else {
				System.out.println("failed to connect with mysql");
			}
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
		}
	}

	public static List<Emp> read() {
		
		if(con==null) {
			return null;
		}
		
		System.out.println("con value: "+con);
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Emp> empList = new ArrayList<>();
		
		try{  
			
			stmt = con.createStatement();  
			rs = stmt.executeQuery("select * from emp");  
			
			while(rs.next())  {
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
				Emp emp = new Emp();
				int empId = rs.getInt(1);
				emp.setId(empId);
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				Address address = readAddress(empId);
				emp.setAddress(address);
				empList.add(emp);
			}
		}
		catch(Exception e){ 
			e.printStackTrace();
		}  
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return empList;
	}
	
	//read row from table address
	public static Address readAddress(int empId) {
		
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		Address address = new Address();
		
		try{  
			String query = "select * from address where empid =?";
			pStatement = con.prepareStatement(query);  
			pStatement.setInt(1, empId);
			rs = pStatement.executeQuery();  
			
			while(rs.next())  {
				//System.out.println("address: "+rs.getInt(1)+"  "+rs.getInt(2)+"   " +rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));  
				address.setId(rs.getInt(1));
				address.setEmpId(rs.getInt(2));
				address.setCity(rs.getString(3));
				address.setState(rs.getString(4));
				address.setCountry(rs.getString(5));
				
			}
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
		finally {
			try {
				if(pStatement!=null) {
					pStatement.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return address;
	}
	
	//create row inside table emp
	public static void create() {
		
		Statement stmt = null;
		
		try{  
			stmt = con.createStatement();  
			String sql = "INSERT INTO emp(name, age) VALUES ('fdgs', 34)";
			int executeUpdate = stmt.executeUpdate(sql);
			if(executeUpdate>0) {
				System.out.println("data inserted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to insert data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
	}
	
	//update row inside table emp
	public static void update() {
		
		Statement stmt = null;
		try{  
			
			stmt = con.createStatement();  
			String sql = "UPDATE emp SET age = 34 WHERE id=1";
			int executeUpdate = stmt.executeUpdate(sql);
			if(executeUpdate>0) {
				System.out.println("data updated successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to update data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//delete row from table emp
	public static void delete() {
		
		Statement stmt = null;
		
		try{  
			stmt=con.createStatement();  
			String sql = "delete from emp WHERE id=3";
			int executeUpdate = stmt.executeUpdate(sql);
			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete data: "+executeUpdate);
			}
		}
		catch(SQLException se){
		      se.printStackTrace();
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
