package org.liferayasif.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.liferayasif.model.Student;

public class studentRepository {

	static Connection con = null;

	public static void ConnectionOpen() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?serverTimezone=UTC","root","root");
			if(con!=null) {
				System.out.println("connection to mysql successful");
			}
			else
				System.out.println("failed to connect to mysql");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<Student> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Student> studentList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM student");
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString(1));
				student.setSvName(rs.getString(2));
				student.setStudentId(rs.getInt(3));
				student.setEmail(rs.getString(4));
				student.setDob(rs.getDate(5));
				student.setGender(rs.getString(6));
				student.setCourse(rs.getString(7));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
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
		return studentList;
	}
	
	public static void create(Student student) {
		PreparedStatement pStmt = null;
		try {
			String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, student.getName());
			pStmt.setString(2, student.getSvName());
			pStmt.setInt(3, student.getStudentId());
			pStmt.setString(4, student.getEmail());
			pStmt.setDate(5, student.getDob());
			pStmt.setString(6, student.getGender());
			pStmt.setString(7, student.getCourse());
			
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
