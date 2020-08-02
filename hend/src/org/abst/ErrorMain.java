package org.abst;

public class ErrorMain {

	public static void main(String[] args) {
		
		int d = 8;
		int n = 0;
		
		try {
			int r = d / n;
			System.out.println("result: "+r);
		}
		catch(Exception e) {
			System.out.println("some problem");
		}
		
		System.out.println("program end");
	}
}
