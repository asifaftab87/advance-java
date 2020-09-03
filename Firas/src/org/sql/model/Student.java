package org.sql.model;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable{

	private static final long serialVersionUID = 2135876367103984918L;
	private String name;
	private int studentId;
	private int age;
	private String nationality;
	private Date admissionDate;
	private Date graduateDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Date getGraduateDate() {
		return graduateDate;
	}
	public void setGraduateDate(Date graduateDate) {
		this.graduateDate = graduateDate;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", age=" + age + ", nationality=" + nationality + ", admission date=" + admissionDate
				+ ", graduate Date=" + graduateDate + "]";
	}
	
	
}
