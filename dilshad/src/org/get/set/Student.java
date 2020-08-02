package org.get.set;

public class Student {

	private int roll;
	private String email;
	private String name;
	private String addr;
	
	
	//default/parameter less/zero argument constructor
	public Student() {
		System.out.println("constructor");
	}
	
	public Student(String msg) {
		System.out.println("constructor: "+msg);
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
