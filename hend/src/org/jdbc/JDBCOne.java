package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * In this class we are implementing CRUD/CURD (both are same)
 * create
 * read
 * update
 * delete
 * but all operation static
 * using Statement
 * databse name: student
 * table name: emp
 * row of table emp are : id, name, age
 */
public class JDBCOne {

	public static void main(String[] args) {
		
		JDBCOne jdbc = new JDBCOne();
		
		Connection con = null;
		
		try{  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/student?serverTimezone=UTC","root","root");  //here student is database name, root is username and password  
			//jdbc.create(con);
			//jdbc.update(con);
			jdbc.delete(con);
			jdbc.read(con);
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
	
	//create row inside table emp
	public void create(Connection con) {
		
		Statement stmt = null;
		try{  
			
			stmt = con.createStatement();  
			String sql = "INSERT INTO emp(name, age) VALUES ('ali', 23)";
			stmt.executeUpdate(sql);
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

	//read row from table emp
	public void read(Connection con) {
		
		Statement stmt = null;
		ResultSet rs = null;
		try{  
			
			stmt = con.createStatement();  
			rs = stmt.executeQuery("select * from emp");  
			
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
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
	public void update(Connection con) {
		
		Statement stmt = null;
		try{  
			
			stmt = con.createStatement();  
			String sql = "UPDATE emp SET age = 3 WHERE id=9";
			stmt.executeUpdate(sql);
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
			String sql = "delete from emp WHERE id=4";
			stmt.executeUpdate(sql);
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
