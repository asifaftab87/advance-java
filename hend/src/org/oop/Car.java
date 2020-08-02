package org.oop;

public class Car {

	private int year;
	private String model;
	
	public void setValues(int i, String s) {
		year = i;
		model = s;
	}
	
	public void print() {
		System.out.println("year: "+year);
		System.out.println("model: "+model);
		
		if(model!=null) {
			System.out.println("model length: "+model.length());
		}
	}
	
}
