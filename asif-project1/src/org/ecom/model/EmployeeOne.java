package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeOne implements Serializable {

	
	private static final long serialVersionUID = 4403009177020236045L;

	private int id;
	private String name;
	private Date dob;
	private String emailId;
	private boolean gender;
	private Date joinedDate;
	private Date releaseDate;
	private int noticePeriod;
	
	public EmployeeOne() {}

	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public Date getJoinedDate() {
		return joinedDate;
	}



	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}



	public Date getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}




	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	
	
	@Override
	public String toString() {
		return "id:  "+id+"    name:   "+name+"    dob:   " +dob+"    emailId:   "+emailId+"   gender:   "+gender+""
				+ "joinedDate:   "+joinedDate+"   releaseDate:   "+releaseDate+"    noticePeriod:"   +noticePeriod;
	
	}







}
