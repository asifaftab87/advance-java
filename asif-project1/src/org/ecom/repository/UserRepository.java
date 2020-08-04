package org.ecom.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.User;

public class UserRepository {

	public static ResultSet getAllUser(Connection con) {

		System.out.println("reading user");
		
		if (con == null) {
			return null;
		}

		Statement stmt = null;
		ResultSet rs = null;

		List<User> userList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			
			if(rs!=null) {
				
				while(rs.next())  {
					//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
					User user = new User();
					int empId = rs.getInt(1);
					
					/*emp.setId(empId);
					emp.setName(rs.getString(2));
					emp.setAge(rs.getInt(3));
					empList.add(emp);
					*/
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
		return null;
	}
}
