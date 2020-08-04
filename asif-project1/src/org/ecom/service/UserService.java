package org.ecom.service;

import java.sql.Connection;
import java.util.List;

import org.ecom.model.User;
import org.ecom.util.GetSqlConnection;

public class UserService {

	
	public List<User> getAllUser(){
		
		Connection con = GetSqlConnection.connectionOpen();
		
		if(con!=null) {
			
		}
		return null;
	}
}
