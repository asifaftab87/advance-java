package org.loop;

public class Decr {

	public static void main(String[] args) {
		
		int n = 3;
		
		for(int r=0 ; r<n ; r++) {
			
			for(int c=1 ; c<=n-r ; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
