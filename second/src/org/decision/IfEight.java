package org.decision;


//print odd/even
public class IfEight {

	public static void main(String[] args) {

		int p = 59;
		
		if(p>=60) {
			System.out.println("1");
		}
		else {
			if(p>=50) {
				System.out.println("2");
			}
			else {
				if(p>=40) {
					System.out.println("3");
				}
				else {
					System.out.println("failed");
				}
			}
		}
	}
}
