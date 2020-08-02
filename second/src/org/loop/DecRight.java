package org.loop;

public class DecRight {

	public static void main(String[] args) {
		
		int n = 6;
		
		for(int r=0 ; r<n ; r++) {
			
			for(int s=1 ; s<=r ; s++) {
				System.out.print(" ");
			}
			
			for(int c=1 ; c<=n-r ; c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
