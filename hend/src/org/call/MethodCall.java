package org.call;

public class MethodCall {

	public static void main(String[] args) {
		
		System.out.println("start main");
		
		func();
		
		System.out.println("end main");
		
		func();
		
	}
	
	public static void func() {
		
		System.out.println("from func");
	}
}
