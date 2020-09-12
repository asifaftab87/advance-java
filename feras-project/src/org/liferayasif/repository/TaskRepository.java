package org.liferayasif.repository;

import org.liferayasif.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
	static Connection con = null;

	public static void ConnectionOpen() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?serverTimezone=UTC", "root", "root");

			if (con != null) {
				System.out.println("connection to mysql success");
			} else {
				System.out.println("failed to connect to mysql");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<Task> read() {
		if (con == null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;

		List<Task> taskList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM task");
			while (rs.next()) {
				Task task = new Task();
				task.setName(rs.getString(1));
				task.setEmailId(rs.getString(2));
				task.setGender(rs.getBoolean(3));
				task.setDob(rs.getDate(4));
				task.setAge(rs.getInt(5));
				taskList.add(task);
				
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
		return taskList;
	}

	public static void create(Task task) {
		PreparedStatement pStmt = null;
		try {
			String sql = "INSERT INTO task VALUES (?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, task.getName());
			pStmt.setString(2, task.getEmailId());
			pStmt.setBoolean(3, task.getGender());
			pStmt.setDate(4, task.getDob());
			pStmt.setInt(5, task.getAge());
			
			int executeUpdate = pStmt.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println(executeUpdate + " data created successfully");
			} else {
				System.out.println("failed to create data");
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pStmt != null) {
					pStmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void delete() {
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			String sql = "DELETE FROM task WHERE userId=2";
			int executeUpdate = stmt.executeUpdate(sql);
			if (executeUpdate > 0) {
				System.out.println(executeUpdate + " data deleted successfully");
			} else {
				System.out.println("failed to delete data");
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

	public static void update() {
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			String query = "UPDATE task SET age=? WHERE userId=4";
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
}
