package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * In this class we are implementing CRUD/CURD (both are same)
 * create
 * read
 * update
 * delete
 * but all operation dynamic
 * using preparedstatement
 * databse name: student
 * table name: emp
 * row of table emp are : id, name, age
 */
public class JDBCTwo {

	public static void main(String[] args) {
		
		JDBCTwo jdbc = new JDBCTwo();
		
		Connection con = null;
		
		try{  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/student?serverTimezone=UTC","root","root");  //here student is database name, root is username and password  
			//jdbc.create(con, "jain", 60);
			//jdbc.update(con, "jain", 87, 13);
			//jdbc.delete(con, 13);
			jdbc.read(con, 18);
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
		}  
		finally {
			try {
				con.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
	}  
	
	//create row inside table emp
	public void create(Connection con, String name, int age) {
		
		PreparedStatement pStatement = null;
		
		try{  
			
			String query = "INSERT INTO emp(name, age) VALUES (?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			pStatement.setInt(2, age);
			int executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data created successfully: "+executeUpdate);
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
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//read row from table emp
	public void read(Connection con, int age) {
		
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		try{  
			String query = "select * from emp where age >=?";
			pStatement = con.prepareStatement(query);  
			pStatement.setInt(1, age);
			rs = pStatement.executeQuery();  
			
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
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
	}
	
	//update row inside table emp
	public void update(Connection con, String name, int age, int id) {
		
		PreparedStatement pStatement = null;
		
		try{  
			String query = "UPDATE emp SET name=?, age=? WHERE id=?";
			pStatement = con.prepareStatement(query);  
			pStatement.setString(1, name);
			pStatement.setInt(2, age);
			pStatement.setInt(3, id);
			int executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data updated successfully: "+executeUpdate);
			}
			else {
				System.out.println("faile to update: "+executeUpdate);
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
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//delete row from table emp
	public void delete(Connection con, int id) {
		
		PreparedStatement pStatement = null;
		
		try{  
			String query = "DELETE FROM emp WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, id);
			int executeUpdate = pStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete: "+executeUpdate);
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
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
