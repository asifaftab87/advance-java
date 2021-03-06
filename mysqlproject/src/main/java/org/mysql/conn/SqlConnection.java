package org.mysql.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.mysql.conn.model.Emp;

public class SqlConnection {

	public static void main(String[] args) {
		
		Connection con = null;
		
		SqlConnection sc = new SqlConnection();
		try{  
			con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/student?serverTimezone=UTC", "root", "root");  //here student is database name, root is username and password  
			if(con!=null){
				//System.out.println("successfully connected with mysql");
				//sc.create(con);
				//sc.update(con);
				//sc.delete(con);
				List<Emp> empList = sc.read(con);
				
				for(Emp e : empList) {
					System.out.print("id: "+e.getId());
					System.out.print("  name: "+e.getName());
					System.out.println("  age: "+e.getAge());
				}
			}
			else {
				System.out.println("failed to connect with mysql");
			}
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
		}  
		finally {
			try {
				if(con!=null) {
					con.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
	}  
	
	
	//read row from table emp
	public List<Emp> read(Connection con) {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Emp> empList = new ArrayList<>();
		
		try{  
			
			stmt = con.createStatement();  
			rs = stmt.executeQuery("select * from emp");  
			
			while(rs.next())  {
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
				Emp emp = new Emp();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				empList.add(emp);
			}
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
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
	
	//create row inside table emp
	public void create(Connection con) {
		
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
	public void update(Connection con) {
		
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
	public void delete(Connection con) {
		
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
