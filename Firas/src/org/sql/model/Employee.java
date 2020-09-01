package org.sql.model;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = -8545901547885450379L;
	private int id;
	private String name;
	private Date dob;
	private String emailId;
	private String gender;
	private Date joinedDate;
	private Date releaseDate;
	private int noticePeriod;
	private Date createDate;
	private Date updateDate;
	private int age;
	
	public Employee() {}
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dob=" + dob + ", emailId=" + emailId + ", gender=" + gender
				+ ", joined_date=" + joinedDate + ", releaseDate=" + releaseDate + ", noticePeriod=" + noticePeriod
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

	
}
