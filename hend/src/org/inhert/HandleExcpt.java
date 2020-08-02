package org.inhert;

public class HandleExcpt {

	public static void main(String[] args) {
		
		int i = 15;
		
		System.out.println("start");
		
		try {
			int b = i / 0;
			System.out.println("b: "+b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
}
