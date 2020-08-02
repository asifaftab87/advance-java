package org.loop;

public class Fibonacci {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		
		System.out.print(y+" ");
		
		for(int n=1 ; n<=6 ; n++) {
			int s = x + y;
			System.out.print(s+" ");
			x = y;
			y = s;
		}
	}
}
