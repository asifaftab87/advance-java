package org.ecom.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.User;

public class UserRepository {

	public static List<User> getAllUser(Connection con) {

		System.out.println("-----------getAllUser------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<User> userList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from user");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					User user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
					userList.add(user);
				}
				
			}
		} 
		catch (Exception e) {
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
		return userList;
	}
	
	public static User findUserById(Connection con, long userId) {

		System.out.println("-----------findUserById userid: "+userId);

		ResultSet rs = null;
		User user = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = "select * from user where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					user = new User();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setDob(rs.getDate(4));
					user.setEmail(rs.getString(5));
					user.setFatherName(rs.getString(6));
					user.setGender(rs.getBoolean(7));
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
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
		return user;
	}
	
	public static void createUser(Connection con, User user) {
		
		System.out.println("-----------createUser------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			
			String query = 	  "INSERT INTO user(firstName, lastName, dob, email, fatherName, gender) "
							+ " VALUES (?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			
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
	
	public static void updateUser(Connection con, User user) {
		
		System.out.println("-----------updateUser------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(user.getDob().getTime());
			
			String query = 	  " update user set firstName=?, lastName=?, dob=?, email=?, fatherName=?, gender=? "
							+ " where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, user.getFirstName());
			pStatement.setString(2, user.getLastName());
			pStatement.setDate(3, sqlDate);
			pStatement.setString(4, user.getEmail());
			pStatement.setString(5, user.getFatherName());
			pStatement.setBoolean(6, user.getGender());
			pStatement.setInt(7, user.getId());
			
			int executeUpdate = pStatement.executeUpdate();
			
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
				if(pStatement!=null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int deleteUserById(Connection con, long userId) {

		System.out.println("-----------deleteUserById userid: "+userId);
		
		int executeUpdate = 0;
		PreparedStatement pStatement = null;
		
		try {
			String query = "delete from user where id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, userId);
			executeUpdate = pStatement.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("data deleted successfully: "+executeUpdate);
			}
			else {
				System.out.println("failed to delete data: "+executeUpdate);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
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
		}
		
		return executeUpdate;
	}
	
	
}
