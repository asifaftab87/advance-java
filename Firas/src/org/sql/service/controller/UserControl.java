package org.sql.service.controller;

import java.sql.Date;
import java.util.List;

import org.sql.model.User;
import org.sql.service.UserService;

public class UserControl {
	UserService userService = null;
	
	public UserControl(){				//constructor
	userService = new UserService();
	}
	public static void main(String[] args) {
		UserControl usercontrol = new UserControl();
		
		//usercontrol.addUser();
		
		//usercontrol.update();
		
		//usercontrol.findAll();
		
		//usercontrol.findById(1);
		
		//usercontrol.findByName("Firas");
		
		Date fromDobDate = Date.valueOf("1990-01-01");
		Date toDobDate = Date.valueOf("1995-12-30");
		//usercontrol.findByDob(fromDobDate, toDobDate);
		
		Date fromJoinedDate = Date.valueOf("2009-01-01");
		Date toJoinedDate = Date.valueOf("2011-12-31");
		//usercontrol.findByJoinedDate(fromJoinedDate, toJoinedDate);
		
		Date fromGraduateDate = Date.valueOf("2012-01-01");
		Date toGraduateDate = Date.valueOf("2015-12-31");
		//usercontrol.findByGraduateDate(fromGraduateDate, toGraduateDate);
		
		//usercontrol.findByemailId("ferasama@gmail.com");
		
		//usercontrol.findByGender("male");

	}
	
	public void addUser() {
		System.out.println("----------Adding user---------------");
		User user = new User();
		user.setId(4);
		user.setName("Amir");
		user.setEmailId("amir@gmail.com");
		Date dob = Date.valueOf("1980-12-14");
		user.setDob(dob);
		user.setGender("male");
		Date date = Date.valueOf("2009-05-12");
		user.setJoinedDate(date);
		date = Date.valueOf("2012-05-17");
		user.setGraduateDate(date);
		user.setCreateDate(new Date(new java.util.Date().getTime()));
		user.setUpdateDate(new Date(new java.util.Date().getTime()));
		userService.create(user);
	}
	
	public void update() {
		userService.update();
	}
	
	public void findAll() {
		System.out.println("----------find all---------------");
		List<User> userList = userService.findAll();
		System.out.println(userList);
	}
	public void findById(int id) {
		System.out.println("----------find by id---------------");
		User user = userService.findById(id);
		System.out.println("User: "+ user);
	}
	
	public void findByName(String name) {
		System.out.println("----------find by id---------------");
		List<User> userList = userService.findByName(name);
		System.out.println(userList);
	}
	
	public void findByDob(Date fromDobDate, Date toDobDate) {
		System.out.println("----------findbydob user to todate user---------------");
		List<User> userList = userService.findByDob(fromDobDate, toDobDate);
		System.out.println(userList);
	}
	
	public void findByJoinedDate(Date fromJoinedDate, Date toJoinedDate) {
		System.out.println("----------findby joined date fromjoineddate to tojoineddate---------------");
		List<User> userList = userService.findByJoinedDate(fromJoinedDate, toJoinedDate);
		System.out.println(userList);
	}
	
	public void findByGraduateDate(Date fromGraduateDate, Date toGraduateDate){
		System.out.println("----------findby graduate date fromgraduatedate to tograduatedate---------------");
		List<User> userList = userService.findByGraduateDate(fromGraduateDate, toGraduateDate);
		System.out.println(userList);
	}
	
	public void findByemailId(String emailId) {
		System.out.println("----------findby emailId---------------");
		User user = userService.findByEmailId(emailId);
		System.out.println("User" + user);
	}
	
	public void findByGender(String gender) {
		System.out.println("----------findby gender---------------");
		List<User> userList = userService.findByGender(gender);
		System.out.println(userList);
	}
}
