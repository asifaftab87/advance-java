package org.over.load;

public class MainOverLoad {

	public static void main(String[] args) {
		
		sum("hello world");
		
		sum(2, 3);
		
		sum();
		
		sum(33);
	}
	
	public static void sum() {
		System.out.println("this is sum method");
	}
	
	public static void sum(int a, int b) {
		System.out.println("this is sum method: "+(a+b));
	}
	
	public static void sum(int a) {
		System.out.println("val: "+a);
	}
	
	public static void sum(String b) {
		System.out.println("val: "+b);
	}
}
