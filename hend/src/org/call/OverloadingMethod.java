package org.call;

public class OverloadingMethod {

	public static void main(String[] args) {
		
		disp("asif", 33);
		disp(1, 2);
		disp(3);
		disp();
		disp(34, "asif");
		disp("hello");
	}
	
	public static void disp() {
		System.out.println("1");
	}
	
	public static void disp(int z) {
		System.out.println("2");
	}
	
	public static void disp(int z, int j) {
		System.out.println("3");
	}
	
	public static void disp(String z) {
		System.out.println("4");
	}
	
	public static void disp(int z, String j) {
		System.out.println("5");
	}

	public static void disp(String z, int j) {
		System.out.println("6");
	}
}
