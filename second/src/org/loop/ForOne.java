package org.loop;

public class ForOne {

	public static void main(String[] args) {
		
		int n = 10;
		int i = 2;
		
		for(;i<n;i++) {
			if(n % i == 0) {
				System.out.println("not prime: "+n);
				break;
			}
		}
		
		if(i==n) {
			System.out.println("prime: "+n);
		}
	}
}
