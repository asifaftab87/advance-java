package org.liferayasif.model;

import java.io.Serializable;
import java.sql.Date;

public class Signup implements Serializable{

	private static final long serialVersionUID = -7430582628975959570L;
	
	private String name;
	private int studentid;
	private String emailid;
	private String repeatEmail;
	private String password;
	private String repeatPassword;
	private int contact;
	private Date dob;
	private String gender;
	private String course;
	private String upload;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getRepeatEmail() {
		return repeatEmail;
	}
	public void setRepeatEmail(String repeatEmail) {
		this.repeatEmail = repeatEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatPassword() {
		return repeatPassword;
	}
	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getUpload() {
		return upload;
	}
	public void setUpload(String upload) {
		this.upload = upload;
	}
	@Override
	public String toString() {
		return "Signup [name=" + name + ", studentid=" + studentid + ", emailid=" + emailid + ", repeatEmail="
				+ repeatEmail + ", password=" + password + ", repeatPassword=" + repeatPassword + ", contact=" + contact
				+ ", dob=" + dob + ", gender=" + gender + ", course=" + course + ", upload=" + upload + "]";
	}
	
	
}
