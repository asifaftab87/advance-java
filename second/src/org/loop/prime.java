package org.loop;

public class prime {

	public static void main(String[] args) {
		
		int n = 710;
		int r;
		
		for(r=2 ; r<n ; r++) {
			
			if(n%r==0) {
				System.out.println("not prime: "+n);
				break;
			}
		}
		
		if(n==r) {
			System.out.println("prime: "+n);
		}
	}
}
