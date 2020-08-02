package org.loop;

public class ForFactorial {

	public static void main(String[] args) {
		
		int f=1;
		
		for(int n=3 ; n>=1 ; n--) {
			f = f * n;
		}
		System.out.println("factorial: "+f);
	}
}
