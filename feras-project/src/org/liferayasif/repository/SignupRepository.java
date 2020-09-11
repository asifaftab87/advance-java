package org.liferayasif.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.liferayasif.model.Signup;

public class SignupRepository {

	static Connection con = null;

	public static void ConnectionOpen() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?serverTimezone=UTC", "root", "root");
			
			if(con!=null) {
				System.out.println("connected to mysql successfully");
			}
			else {
				System.out.println("failed to connect to mysql");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void create(Signup signup) {
		PreparedStatement pStmt = null;
		try {
			String sql = "INSERT INTO signup VALUES(?,?,?,?,?,?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, signup.getName());
			pStmt.setInt(2, signup.getStudentid());
			pStmt.setString(3, signup.getEmailid());
			pStmt.setString(4, signup.getRepeatEmail());
			pStmt.setString(5, signup.getPassword());
			pStmt.setString(6, signup.getRepeatPassword());
			pStmt.setInt(7, signup.getContact());
			pStmt.setDate(8, signup.getDob());
			pStmt.setString(9, signup.getGender());
			pStmt.setString(10, signup.getCourse());
			
			int executeUpdate = pStmt.executeUpdate();
			if(executeUpdate > 0) {
				System.out.println(executeUpdate + "data added successfully");
			}
			else {
				System.out.println("failed to add data");
			}
		}
			catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
		}
		finally {
				try {
					if (pStmt != null) {
						pStmt.close();
					}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
