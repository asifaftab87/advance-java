package org.arr;

public class ArrayThree {

	public static void main(String[] args) {
		
		int b[] = new int[20];
		int i;
		
		for(i=0 ; i<20 ; i++) {
			b[i] = i*2;
		}

		for(i=0 ; i<=19 ; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
		
		 
	}
}
