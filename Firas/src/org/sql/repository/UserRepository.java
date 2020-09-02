package org.sql.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.sql.model.User;

public class UserRepository {

	static Connection con = null;
	
	public static void ConnectionOpen() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?serverTimezone=UTC", "root", "root");
			if(con!=null) {
				System.out.println("connection to mysql successful");
			}
			else {
				System.out.println("failed to conenct to mysql");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void create(User user){
		PreparedStatement pStmt = null;
		try{
			String sql = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, user.getId());
			pStmt.setString(2, user.getName());
			pStmt.setString(3, user.getEmailId());
			pStmt.setDate(4, user.getDob());
			pStmt.setString(5, user.getGender());
			pStmt.setDate(6, user.getJoinedDate());
			pStmt.setDate(7, user.getGraduateDate());
			pStmt.setDate(8, user.getCreateDate());
			pStmt.setDate(9, user.getUpdateDate());
			
			int executeUpdate = pStmt.executeUpdate();
			if(executeUpdate > 0) {
				System.out.println(executeUpdate + "data added successfully");
			}
			else {
				System.out.println("failed to add data");
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			System.out.println();
		}
		finally {
			try {
				if(pStmt !=null) {
					pStmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void update() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			String query = "UPDATE user SET name='Farhan' WHERE emailId='nabila80@mail.com'";
			int executeUpdate = stmt.executeUpdate(query);

			if (executeUpdate > 0) {
				System.out.println(executeUpdate + " updating data successful");
			} else {
				System.out.println("failed to update data");
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static List<User> findAll(){
		if(con==null) {
			return null;
		}
			Statement stmt = null;
			ResultSet rs = null;
		
		List<User> userList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM user");
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}	
		
	public static User findById(int id){
		if(con==null) {
			return null;
		}
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		User user = new User();

		try {
			String query = "SELECT * FROM user WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	
	public static List<User> findByName(String name){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		List<User> userList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM user WHERE name=?";
			pStmt = con.prepareStatement(query);
			pStmt.setString(1, name);
			
			rs = pStmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public static List<User> findByDob(Date fromDobDate, Date toDobDate){
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<>();
		try {
			String query = "SELECT * FROM user WHERE dob BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromDobDate);
			pStatement.setDate(2, toDobDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public static List<User> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<>();
		try {
			String query = "SELECT * FROM user WHERE joined_date Between ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromJoinedDate);
			pStatement.setDate(2, toJoinedDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public static List<User> findByGraduateDate(Date fromGraduateDate, Date toGraduateDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<>();
		try {
			String query = "SELECT * FROM user WHERE graduate_date BETWEEN ? AND ?";
			pStmt = con.prepareStatement(query);
			pStmt.setDate(1, fromGraduateDate);
			pStmt.setDate(2, toGraduateDate);
			rs = pStmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public static User findByEmailId(String emailId){
		if(con==null) {
			return null;
		}
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		User user = new User();

		try {
			String query = "SELECT * FROM user WHERE emailId=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, emailId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	
	public static List<User> findByGender(String gender){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		List<User> userList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM user WHERE gender=?";
			pStmt = con.prepareStatement(query);
			pStmt.setString(1, gender);
			
			rs = pStmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmailId(rs.getString(3));
				user.setDob(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setJoinedDate(rs.getDate(6));
				user.setGraduateDate(rs.getDate(7));
				user.setCreateDate(rs.getDate(8));
				user.setUpdateDate(rs.getDate(9));
				userList.add(user);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
}
		






