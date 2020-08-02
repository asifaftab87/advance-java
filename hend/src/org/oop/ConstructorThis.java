package org.oop;

public class ConstructorThis {

	private int id;
	public ConstructorThis() {
		
		System.out.println("ConstructorThis");
		
	}
	
	public ConstructorThis(int id) {
		this();
		System.out.println("ConstructorThis id: "+id);
		this.id = id;
	}
	
	public void method() {
		
		this.id = 000;
	}
	
	
}
