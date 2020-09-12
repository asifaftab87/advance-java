package org.liferayasif.model;

import java.io.Serializable;

import java.sql.Date;

public class Task implements Serializable{

	private static final long serialVersionUID = 3179387495036252072L;
	
	private String name;
	private String emailId;
	private Boolean gender;
	private Date dob;
	private int age;

	public Task() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", emailId=" + emailId + ", gender=" + gender + ", dob="
				+ dob + "  age="+age+"]";
	}
	
	
}
