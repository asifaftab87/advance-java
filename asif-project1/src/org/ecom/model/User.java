package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	private static final long serialVersionUID = -1582067386243719716L;

	public User() {}
	
	private int id;
	private int firstName;
	private int lastName;
	private Date dob;
	private String email;
	private String fatherName;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFirstName() {
		return firstName;
	}
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	public int getLastName() {
		return lastName;
	}
	public void setLastName(int lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
}
