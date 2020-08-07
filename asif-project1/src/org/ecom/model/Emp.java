package org.ecom.model;

import java.io.Serializable;

public class Emp implements Serializable{

	private static final long serialVersionUID = -1443814004539007341L;
	
	private int id;
	private String name;
	private int age;
	
	public Emp() {}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
