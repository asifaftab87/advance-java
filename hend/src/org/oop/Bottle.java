package org.oop;

public class Bottle {

	private String material;
	private String color;
	private double volume;
	private int price;
	
	public void setValues(String mat, String col, double vol, int pr) {
		material = mat;
		color = col;
		volume = vol;
		price = pr;
	}
	
	public void display() {
		System.out.println("material: "+material);
		System.out.println("color: "+color);
		System.out.println("volume: "+volume);
		System.out.println("price: "+price);
	}
}
