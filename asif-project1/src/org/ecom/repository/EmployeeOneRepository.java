package org.ecom.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.ecom.model.EmployeeOne;

public class EmployeeOneRepository {

	public static List<EmployeeOne> getAllEmployeeOne(Connection con) {

		System.out.println("-----------getAllEmployeeOne------------");
		
		Statement stmt = null;
		ResultSet rs = null;

		List<EmployeeOne> employeeOneList = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employeeone");
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					EmployeeOne employeeOne = new EmployeeOne();
					employeeOne.setId(rs.getInt(1));
					employeeOne.setName(rs.getString(2));
					employeeOne.setDob(rs.getDate(3));
					employeeOne.setEmailId(rs.getString(4));
					employeeOne.setGender(rs.getBoolean(5));
					employeeOne.setJoinedDate(rs.getDate(6));
					employeeOne.setReleaseDate(rs.getDate(7));
					employeeOne.setNoticePeriod(rs.getInt(8));
				

					employeeOneList.add(employeeOne);
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
		return employeeOneList;
	}

	public static void createEmployeeOne(Connection con, EmployeeOne employeeOne) {

		System.out.println("-----------createEmployeeOne------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(employeeOne.getDob().getTime());
			java.sql.Date sqljoinedDate = new java.sql.Date(employeeOne.getJoinedDate().getTime());
			java.sql.Date sqlReleaseDate = new java.sql.Date(employeeOne.getReleaseDate().getTime());
	

			
			String query = 	  "INSERT INTO employeeone(name, dob, emailid, gender, joined_date, release_date, notice_period) "
							+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, employeeOne.getName());
			pStatement.setDate(2, sqlDate);
			pStatement.setString(3, employeeOne.getEmailId());
			pStatement.setBoolean(4, employeeOne.getGender());
			pStatement.setDate(5, sqljoinedDate);
			pStatement.setDate(6, sqlReleaseDate);
			pStatement.setInt(7, employeeOne.getNoticePeriod());
		

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

	public static void updateEmployeeOne(Connection con, EmployeeOne employeeOne) {

		System.out.println("-----------updateEmployeeOne------------");
		
		PreparedStatement pStatement = null;
		
		try{  
			
			//conversion from java.util.Date to java.sql.Date
			java.sql.Date sqlDate = new java.sql.Date(employeeOne.getDob().getTime());
			java.sql.Date sqljoinedDate = new java.sql.Date(employeeOne.getJoinedDate().getTime());
			java.sql.Date sqlReleaseDate = new java.sql.Date(employeeOne.getReleaseDate().getTime());
			

			String query = 	  " update employeeone set name=?, dob=?, emailid=?, gender=?, joined_date=?, release_date=? , notice_period=?"
							+ " where id=? ";
			
			pStatement = con.prepareStatement(query);
			pStatement.setString(1, employeeOne.getName());
			pStatement.setDate(2, sqlDate);
			pStatement.setString(3, employeeOne.getEmailId());
			pStatement.setBoolean(4, employeeOne.getGender());
			pStatement.setDate(5, sqljoinedDate);
			pStatement.setDate(6, sqlReleaseDate);
			pStatement.setInt(7, employeeOne.getNoticePeriod());
		
			pStatement.setInt(8, employeeOne.getId());
			
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

	public static EmployeeOne findEmployeeOneById(Connection con, long employeeOneId) {
		
		System.out.println("-----------findEmployeeOneById employeeOneid: "+employeeOneId);

		ResultSet rs = null;
		EmployeeOne employeeOne = null;
		PreparedStatement pStatement = null;
		
		try {
			String query = " select * from employeeone where id=? ";
			pStatement = con.prepareStatement(query);
			pStatement.setLong(1, employeeOneId);
			rs = pStatement.executeQuery();
			
			if(rs!=null) {
				
				while(rs.next())  {
					  
					employeeOne = new EmployeeOne();
					employeeOne.setId(rs.getInt(1));
					employeeOne.setName(rs.getString(2));
					employeeOne.setDob(rs.getDate(3));
					employeeOne.setEmailId(rs.getString(4));
					employeeOne.setGender(rs.getBoolean(5));
					employeeOne.setJoinedDate(rs.getDate(6));
					employeeOne.setReleaseDate(rs.getDate(7));
					employeeOne.setNoticePeriod(rs.getInt(8));
				

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
		return employeeOne;
	}
	
public static List<EmployeeOne> getEmployeeOneByName(Connection con, String name){
		
		System.out.println("name: "+name);
		List<EmployeeOne> employeeOneList = new ArrayList<>();
		String query = " select * from employeeone where name like ? "; 
					 
		ResultSet rs = null;
		try(PreparedStatement pStatement = con.prepareStatement(query)) {
			
			pStatement.setString(1,  "%" + name + "%");
			
			rs = pStatement.executeQuery();
			
			while(rs.next())  {
				  
				EmployeeOne employeeOne = new EmployeeOne();
				
				employeeOne.setId(rs.getInt(1));
				employeeOne.setName(rs.getString(2));
				employeeOne.setDob(rs.getDate(3));
				employeeOne.setEmailId(rs.getString(4));
				employeeOne.setGender(rs.getBoolean(5));
				employeeOne.setJoinedDate(rs.getDate(6));
				employeeOne.setReleaseDate(rs.getDate(7));
				employeeOne.setNoticePeriod(rs.getInt(8));
				

				employeeOneList.add(employeeOne);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}  
		}
		return employeeOneList;
	}

public static List<EmployeeOne> getEmployeeOneByDob(Connection con, Date fromDobDate, Date toDobDate) {
	
	System.out.println("fromDobDate: "+fromDobDate);
	System.out.println("toDobDate: "+toDobDate);

	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where dob between ? AND ?"; 
			
	
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		java.sql.Date sqlFromDate = new java.sql.Date(fromDobDate.getTime());	//from java.uti.Date to java.sql.Date
		java.sql.Date sqlToDate = new java.sql.Date(toDobDate.getTime());
		
		pStatement.setDate(1, sqlFromDate);
		pStatement.setDate(2, sqlToDate);
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
		
			employeeOneList.add(employeeOne);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}

public static List<EmployeeOne> getEmployeeOneByJoinedDate(Connection con, Date fromJoinedDate, Date toJoinedDate) {
	
	System.out.println("fromJoinedDate: "+fromJoinedDate);
	System.out.println("toJoinedDate: "+toJoinedDate);

	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where joined_date between ? AND ?"; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		java.sql.Date sqlFromDate = new java.sql.Date(fromJoinedDate.getTime());	//from java.uti.Date to java.sql.Date
		java.sql.Date sqlToDate = new java.sql.Date(toJoinedDate.getTime());
		
		pStatement.setDate(1, sqlFromDate);
		pStatement.setDate(2, sqlToDate);
		
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
		
			employeeOneList.add(employeeOne);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}

public static List<EmployeeOne> getEmployeeOneByReleaseDate(Connection con, Date fromReleaseDate,Date toReleaseDate) {
	
	System.out.println("fromReleaseDate: "+fromReleaseDate);
	System.out.println("toReleaseDate: "+toReleaseDate);

	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where release_date between ? AND ?"; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		java.sql.Date sqlFromDate = new java.sql.Date(fromReleaseDate.getTime());	//from java.uti.Date to java.sql.Date
		java.sql.Date sqlToDate = new java.sql.Date(toReleaseDate.getTime());
		
		pStatement.setDate(1, sqlFromDate);
		pStatement.setDate(2, sqlToDate);
		
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
		
			employeeOneList.add(employeeOne);
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}

public static List<EmployeeOne> getEmployeeOneByEmailId(Connection con, String emailId) {
	
	System.out.println("emailId: "+emailId);
	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where emailId = ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1,emailId );
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
		

			employeeOneList.add(employeeOne);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}

public static List<EmployeeOne> getEmployeeOneByGender(Connection con, String gender) {
	
	System.out.println("gender: "+gender);
	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where gender = ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setString(1, gender);
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
			

			employeeOneList.add(employeeOne);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}

public static List<EmployeeOne> getEmployeeOneByNoticePeriod(Connection con, int noticePeriod) {
	
	System.out.println("noticePeriod: "+noticePeriod);
	List<EmployeeOne> employeeOneList = new ArrayList<>();
	String query = " select * from employeeone where notice_period = ? "; 
				 
	ResultSet rs = null;
	try(PreparedStatement pStatement = con.prepareStatement(query)) {
		
		pStatement.setInt(1, noticePeriod);
		
		rs = pStatement.executeQuery();
		
		while(rs.next())  {
			  
			EmployeeOne employeeOne = new EmployeeOne();
			
			employeeOne.setId(rs.getInt(1));
			employeeOne.setName(rs.getString(2));
			employeeOne.setDob(rs.getDate(3));
			employeeOne.setEmailId(rs.getString(4));
			employeeOne.setGender(rs.getBoolean(5));
			employeeOne.setJoinedDate(rs.getDate(6));
			employeeOne.setReleaseDate(rs.getDate(7));
			employeeOne.setNoticePeriod(rs.getInt(8));
			

			employeeOneList.add(employeeOne);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(rs!=null) {
				rs.close();
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	return employeeOneList;
}


}
	

