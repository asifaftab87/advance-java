package org.call;

public class Math {

	public static void main(String[] args) {
		
		print("Hello World");
		
		message();
		
		int p = product();
		System.out.println("product: "+p);
		
		double sum = sum(3, 4.5);
		System.out.println("sum: "+sum);
	}
	
	public static void message() {
		System.out.println("welcome to method");
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static int product() {
		return 7 * 5;
	}
	
	public static double sum(int a, double b) {
		double s = a + b;
		return s;
	}
	
}
