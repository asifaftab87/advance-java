package org.arr;

public class ArraySum {

public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0] = 3;
		a[1] = 1;
		a[2] = -3;
		a[3] = -10;
		a[4] = -11;

		int sum = 0 ;
		
		for(int i=0 ; i<5 ; i++) {
			sum = sum +a[i];
		}
		
		System.out.println("sum: "+sum);
	}

}
