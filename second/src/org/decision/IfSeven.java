package org.decision;


//print odd/even
public class IfSeven {

	public static void main(String[] args) {

		int i = 111, j=14, k=900;
		
		if(i>j) {
			if(i>k) {
				System.out.println("i");
			}
			else {
				System.out.println("k");
			}
		}
		else {
			if(j>k) {
				System.out.println("j");
			}
			else {
				System.out.println("k");
			}
		}
	}
}
