package org.call;

public class FactorialArr {

	public static void main(String[] args) {
		
		
		int a = 2, b = 4, c = 5, d = 7;
		
		factorial(a);
		factorial(b);
		factorial(c);
		factorial(d);
		
	}
	
	public static void factorial(int n) {
		
		int f = 1;
		
		while(n>0) {
			f = f*n ;
			n--;
		}
		
		System.out.println(f);
	}
}
