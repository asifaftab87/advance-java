package org.inhert;

public class ArithCaste {

	public static void main(String[] args) {
		
		int i = 5/2;
		double f = 5/2.0;
		
		int k = (int)(5/2.0);
		
		System.out.println("i: "+i);
		System.out.println("f: "+f);
		System.out.println("k: "+k);
	}
}
