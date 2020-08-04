package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modela.Car;

public class SqlUtil {
		
	private static Connection con = null;
	
	public static void connectionClose() {
		
		try {
			if(con!=null) {
				con.close();
				System.out.println("connection close successfully");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	
	public static void connectionOpen() {
		
		try{ 
			Class.forName("com.mysql.jdbc.Driver");
			//here cars is database name, root is username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars?serverTimezone=UTC", "root", "root");    
			
			if(con!=null){
				System.out.println("connected with mysql successfully");
			}
			else {
				System.out.println("failed to connect with mysql");
			}
		}
		catch(Exception e){ 
			System.out.println(e.getMessage());
		}
	}
//Read row from table car
	public static List<Car> read() {
		
		if(con==null) {
			return null;
		}
		
		System.out.println("con value: "+con);
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Car> carList = new ArrayList<>();
		
		try{  
			
			stmt = con.createStatement();  
			rs = stmt.executeQuery("select * from car");  
			
			while(rs.next())  {
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
				Car car = new Car();
				car.setId(rs.getInt(1));
				car.setBrand(rs.getString(2));
				car.setHorsepower(rs.getInt(3));
				car.setAverage(rs.getFloat(4));
				car.setColour(rs.getString(5));
				carList.add(car);
			}
		}
		catch(Exception e){ 
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
		return carList;
	}
	
		
//create row inside table car
		public static void create(String brand, Integer horsepower, Float average, String colour) {
			
			PreparedStatement pStatement = null;
			
			try{  
				 
				String sql = "INSERT INTO car(brand, horsepower, average, Colour) VALUES (?, ?, ?, ?)";
				pStatement = con.prepareStatement(sql);
				pStatement.setString(1, brand);
				pStatement.setInt(2, horsepower);
				pStatement.setFloat(3, average);
				pStatement.setString(4, colour);
				int executeUpdate = pStatement.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("data inserted successfully: "+executeUpdate);
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
		
//update row inside table car
		public void update(Connection con) {
			
			Statement stmt = null;
			try{  
				
				stmt = con.createStatement();  
				String sql = "UPDATE car Set colour = 'Silver' Where id=2";
				int executeUpdate = stmt.executeUpdate(sql);
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
					if(stmt!=null) {
						stmt.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
//delete row from table car
		public void delete(Connection con) {
			
			Statement stmt = null;
			
			try{  
				stmt=con.createStatement();  
				String sql = "delete from car Where id=6";
				int executeUpdate = stmt.executeUpdate(sql);
				if(executeUpdate>0) {
					System.out.println("data deleted successfully: "+executeUpdate);
				}
				else {
					System.out.println("failed to delete data: "+executeUpdate);
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
					if(stmt!=null) {
						stmt.close();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}

}

