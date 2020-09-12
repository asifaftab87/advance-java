package org.liferayasif.model;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable {

	private static final long serialVersionUID = 7316554658422157541L;
	private String name;
	private String svName;
	private int studentId;
	private String email;
	private Date dob;
	private String gender;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSvName() {
		return svName;
	}
	public void setSvName(String svName) {
		this.svName = svName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "studentModel [name=" + name + ", svName=" + svName + ", studentId=" + studentId + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + ", course=" + course + "]";
	}
	
	
}
