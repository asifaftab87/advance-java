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

import org.sql.model.Employee;
import org.sql.model.Student;
import org.sql.model.User;

public class StudentRepository {
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
	
	public static void add(Student student) {
			
		PreparedStatement pStmt = null;
			try{
				String sql = "INSERT INTO student VALUES(?,?,?,?,?,?)";
				pStmt = con.prepareStatement(sql);
				pStmt.setString(1, student.getName());
				pStmt.setInt(2, student.getStudentId());
				pStmt.setInt(3, student.getAge());
				pStmt.setString(4, student.getNationality());
				pStmt.setDate(5, student.getAdmissionDate());
				pStmt.setDate(6, student.getGraduateDate());
				
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
			String query = "UPDATE student SET ? WHERE emailId=?";
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
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
				studentList.add(student);
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
		return studentList;
	}
	
	public static List<Student> findByName(String name){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		List<Student> studentList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM Student WHERE name=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString(1));
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
				studentList.add(student);
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
		return studentList;
	}
	public static List<Student> findByAge(int fromAge, int toAge){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<Student> studentList = new ArrayList<>();
		try {
			String query = "SELECT * FROM student WHERE age BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setInt(1, fromAge);
			pStatement.setInt(2, toAge);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString(1));
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
				studentList.add(student);
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
		return studentList;
	}
	
	public static Student findByStudentId(int studentId){
		if(con==null) {
			return null;
		}
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Student student = new Student();

		try {
			String query = "SELECT * FROM student WHERE studentId=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, studentId);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				student.setName(rs.getString(1));
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
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
		return student;
	}
	
	public static List<Student> findByAdmissionDate(Date fromAdmissionDate, Date toAdmissionDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<Student> studentList = new ArrayList<>();
		try {
			String query = "SELECT * FROM student WHERE admission_date BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromAdmissionDate);
			pStatement.setDate(2, toAdmissionDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString(1));
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
				studentList.add(student);
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
		return studentList;
	}
	
	
	public static List<Student> findByGraduateDate(Date fromGraduateDate, Date toGraduateDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<Student> studentList = new ArrayList<>();
		try {
			String query = "SELECT * FROM student WHERE graduate_date BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromGraduateDate);
			pStatement.setDate(2, toGraduateDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString(1));
				student.setStudentId(rs.getInt(2));
				student.setAge(rs.getInt(3));
				student.setNationality(rs.getString(4));
				student.setAdmissionDate(rs.getDate(5));
				student.setGraduateDate(rs.getDate(6));
				studentList.add(student);
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
		return studentList;
	}
}
