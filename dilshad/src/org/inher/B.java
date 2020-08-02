package org.inher;

public class B extends A{

	public B() {
		System.out.println("constructor B");
	}
	
	public int prod(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
}
