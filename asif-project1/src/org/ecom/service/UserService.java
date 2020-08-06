package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.User;
import org.ecom.repository.UserRepository;
import org.ecom.util.GetSqlConnection;

public class UserService {

	private Connection con = null;
	
	public UserService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public List<User> getAllUser(){
		
		List<User> userList = new ArrayList<>();
		
		if(con!=null) {
			userList = UserRepository.getAllUser(con);
		}
		
		return userList;
	}
	
	public User findUserById(int id){
		
		User user = null;
		
		if(con!=null) {
			user = UserRepository.findUserById(con, id);
		}
		
		return user;
	}
	
	public int deleteUserById(Connection con, int userId) {
		return UserRepository.deleteUserById(con, userId);
	}
	
	public void createUser(Connection con, User user) {
		UserRepository.createUser(con, user);
	}
	
}
