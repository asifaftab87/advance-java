package org.emp.sql.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class sqlUtil {

	private static Connection con = null;

	public static void connectionClose() {

		try {
			if (con != null) {
				con.close();
				System.out.println("connection close successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void ConnectionOpen() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC", "root", "Waleed");
			if (con != null) {
				System.out.println("successfully connected with mysql");
			} else {
				System.out.println("faild connect with mysql");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	//create row inside table author
		public static void create(int Emp_id,String firstName,String email,String jobTitle) {
			
			PreparedStatement pStatement = null;
			
			try{  
				
				String query = "INSERT INTO employees(Emp_id,firstName,email,jobTitle) VALUES (?, ?,?,?)";
				pStatement = con.prepareStatement(query);
				pStatement.setInt(1, Emp_id);
				pStatement.setString(2, firstName);
				pStatement.setString(3, email);
				pStatement.setString(4, jobTitle);
				
			
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

	

	}

