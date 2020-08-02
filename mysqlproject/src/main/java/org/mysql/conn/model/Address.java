package org.mysql.conn.model;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = -1443814004539007341L;
	
	private int id;
	private int empId;
	private String city;
	private String state;
	private String country;
	
	public Address() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
