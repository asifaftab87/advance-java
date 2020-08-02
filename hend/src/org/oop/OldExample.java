package org.oop;

public class OldExample {

	public static void main(String[] args) {
	
		OldExample oe = new OldExample();
		oe.print();
	}

	private void print() {
		System.out.println("this is print method");
		dis();
	}
	
	public static void dis() {
		System.out.println("hello");
	}
	
}
