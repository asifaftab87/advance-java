package org.decision;


//print odd/even
public class IfSix {

	public static void main(String[] args) {

		int i = -11;
		
		if(i>0) {	//checking for positive
			System.out.println("positive");
			if(i%2==0) {		//checking for even
				System.out.println("even: "+i);
			}
			else {
				System.out.println("odd: "+i);
			}
		}
		else {
			System.out.println("negative");
			if(i%2==0) {		//checking for even
				System.out.println("even: "+i);
			}
			else {
				System.out.println("odd: "+i);
			}
		}
		System.out.println("end");
		
	}

}
