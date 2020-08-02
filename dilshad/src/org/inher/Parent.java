package org.inher;

public class Parent {

	private int a;
	private int b;
	
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println("sum "+(a+b));
	}
	
}
