package org.arr;

public class ArrayFour {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 32;
		a[1] = 1;
		a[2] = -33;
		a[3] = 90;
		a[4] = -11;
		
		for(int i=0 ; i<5 ; i++) {
			if(a[i]%2!=0) {
				System.out.println("odd: "+a[i]);
			}
		}
		
	}
}
