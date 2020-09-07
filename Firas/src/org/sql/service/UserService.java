package org.sql.service;

import java.sql.Date;
import java.util.List;

import org.sql.model.User;
import org.sql.repository.UserRepository;

public class UserService {
	public UserService() {
		UserRepository.ConnectionOpen();
	}
	
	public void create(User user) {
		UserRepository.create(user);
	}
	
	public void update() {
		UserRepository.update();
		User user = new User();
		user.setCreateDate(new Date(new java.util.Date().getTime()));
		user.setUpdateDate(new Date(new java.util.Date().getTime()));
	}
	
	public List<User> findAll(){
		List<User> userList = UserRepository.findAll();
			for(User user : userList) {
			}
			return userList;
	}
	
	public User findById(int id) {
		return UserRepository.findById(id);
	}
	
	public List<User> findByName(String name){
		List<User> userList = UserRepository.findByName(name);
		return userList;
	}
	
	public List<User> findByDob(Date fromDobDate, Date toDobDate){
		return UserRepository.findByDob(fromDobDate, toDobDate);
	}
	
	public List<User> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return UserRepository.findByJoinedDate(fromJoinedDate, toJoinedDate);
	}
	
	public List<User> findByGraduateDate(Date fromGraduateDate, Date toGraduateDate){
		return UserRepository.findByGraduateDate(fromGraduateDate, toGraduateDate);
	}
	
	public User findByEmailId(String emailId){
		return UserRepository.findByEmailId(emailId);
	}
	
	public List<User> findByGender(String gender){
		return UserRepository.findByGender(gender);
	}
}
