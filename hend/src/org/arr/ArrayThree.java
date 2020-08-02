package org.arr;

public class ArrayThree {

	public static void main(String[] args) {
		
		double a[] = new double[50];
		
		for(int i=0 ; i<50 ; i++) {
			a[i] = Math.random();
		}
		
		for(int i=0 ; i<50 ; i++) {
			System.out.println("a["+i+"] "+a[i]);
		}
		
	}
}
