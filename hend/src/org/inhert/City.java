package org.inhert;

public class City {

	int id;
	
	public City(int id) {
		System.out.println("City constructor: "+id);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void method() {
		System.out.println("parent method  id: "+id);
	}
}
