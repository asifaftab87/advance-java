package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentSql {
	public static void ConnectionOpen() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?serverTimezone=UTC", "root", "root");
			if(con!=null) {
				System.out.println("connection to mysql successful");
			}
			else {
				System.out.println("failed to connect to mysql");
			}
		}	
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
