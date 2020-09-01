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


public class EmpRepository {
	static Connection con = null;

	public static void ConnectionOpen() {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?serverTimezone=UTC","root","root");
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
	
	public static List<Employee> findAll(){
		if(con==null) {
			return null;
		}
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Employee> empList = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM empolyee");
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
				emp.setAge(rs.getInt(11));
				empList.add(emp);
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
		return empList;
	}
	
	
	public static Employee findById(int id){
	
		if(con==null) {
			return null;
		}
		
		ResultSet rs = null;
		PreparedStatement pStatement = null;
		Employee emp = new Employee();

		try {
			String query = "SELECT * FROM employee WHERE id=?";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, id);
			
			rs = pStatement.executeQuery();
			
			if(rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
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
		return emp;
	}
	
	public static List<Employee> findByName(String name){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM employee WHERE name=?";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, name);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
				empList.add(emp);
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
		return empList;
	}
	
	public static List<Employee> findByDob(Date fromDobDate, Date toDobDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<Employee> empList = new ArrayList<>();
		try {
			String query = "SELECT * FROM employee WHERE dob BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromDobDate);
			pStatement.setDate(2, toDobDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				empList.add(emp);
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
		return empList;
	}
	
	public static List<Employee> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		List<Employee> empList = new ArrayList<>();
		try {
			String query = "SELECT * FROM employee WHERE joinedDate BETWEEN ? AND ?";
			pStatement = con.prepareStatement(query);
			pStatement.setDate(1, fromJoinedDate);
			pStatement.setDate(2, toJoinedDate);
			
			rs = pStatement.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				empList.add(emp);
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
		return empList;
	}
	
	public static List<Employee> findByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		List<Employee> empList = new ArrayList<>();
		try {
			String query = "SELECT * FROM employee WHERE joinedDate BETWEEN ? AND ?";
			pStmt = con.prepareStatement(query);
			pStmt.setDate(1, fromReleaseDate);
			pStmt.setDate(2, toReleaseDate);
			
			rs = pStmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				empList.add(emp);
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
		return empList;
	}
	
	public static Employee findByEmailId(String emailId){
		
		if(con==null) {
			return null;
		}
		ResultSet rs = null;
		PreparedStatement pStmt = null;
		Employee emp = new Employee();

		try {
			String query = "SELECT * FROM employee WHERE emailId=?";
			pStmt = con.prepareStatement(query);
			pStmt.setString(1, emailId);
			
			rs = pStmt.executeQuery();
			
			if(rs.next()) {
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
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
		return emp;
	}
	
	public static List<Employee> findByNoticePeriod(int noticePeriod){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM employee WHERE noticePeriod=?";
			pStmt = con.prepareStatement(query);
			pStmt.setInt(1, noticePeriod);
			
			rs = pStmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
				empList.add(emp);
			}	
		}
		catch (SQLException e) {
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
		return empList;
	}
	
	public static List<Employee> findByGender(String gender){
		
		if(con==null) {
			return null;
		}
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM employee WHERE gender=?";
			pStmt = con.prepareStatement(query);
			pStmt.setString(1, gender);
			
			rs = pStmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDob(rs.getDate(3));
				emp.setEmailId(rs.getString(4));
				emp.setGender(rs.getString(5));
				emp.setJoinedDate(rs.getDate(6));
				emp.setReleaseDate(rs.getDate(7));
				emp.setNoticePeriod(rs.getInt(8));
				emp.setCreateDate(rs.getDate(9));
				emp.setUpdateDate(rs.getDate(10));
				empList.add(emp);
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
		return empList;
	}
	
	public static void create(Employee employee) {
		PreparedStatement pStmt = null;
		try {
			String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, employee.getId());
			pStmt.setString(2, employee.getName());
			pStmt.setDate(3, employee.getDob());
			pStmt.setString(4, employee.getEmailId());
			pStmt.setString(5, employee.getGender());
			pStmt.setDate(6, employee.getJoinedDate());
			pStmt.setDate(7, employee.getReleaseDate());
			pStmt.setInt(8, employee.getNoticePeriod());
			pStmt.setDate(9, employee.getCreateDate());
			pStmt.setDate(10, employee.getUpdateDate());
			
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
	
	public static void update() {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			String query = "UPDATE employee SET name='Farhan' WHERE emailId='nabila80@mail.com'";
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
