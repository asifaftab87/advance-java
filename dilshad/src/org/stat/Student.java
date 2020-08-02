package org.stat;

public class Student {

	public int id;
	public static String country;
	
	public static void statDisplay() {
		System.out.println("this is static method");
	}
	
	public void print() {
		System.out.println("this is instance method");
	}
}
