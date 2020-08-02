package org.call;

public class Arithmetic {

	public static void main(String[] args) {
		
		int s = sum(4, 3);
		int prod = product(4, 3);
		int sub = sub(4, 3);
		double d = div(4, 3);
		
		System.out.println("s: "+s);
		System.out.println("prod: "+prod);
		System.out.println("sub: "+sub);
		System.out.println("div: "+d);
		
	}
	
	public static int sum(int a, int b) {
		
		int sum = a + b;
		return sum;
	}
	
	public static int product(int a, int b) {
		
		int sum = a * b;
		return sum;
	}

	public static int sub(int a, int b) {
		
		int sum = a - b;
		return sum;
	}

	public static double div(int a, int b) {
		
		double sum = a / (double)b;
		return sum;
	}
}
