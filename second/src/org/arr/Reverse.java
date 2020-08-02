package org.arr;


//wap(write a program) to reverse an array
public class Reverse {

	public static void main(String[] args) {
		
		int k[] = new int[9999999];
		
		for(int i=0 ; i<k.length ; i++) {
			k[i] = i + 20;
		}

		System.out.println("before reverse");
		for(int i=0 ; i<k.length ; i++) {
			System.out.println("k["+i+"] = "+k[i]+", ");
		}

		for(int i=0, j=k.length-1; j>i ; i++, j--) {
			int t = k[i];		
			k[i] = k[j];
			k[j] = t;
		}

		System.out.println("\nafter reverse");
		for(int i=0 ; i<k.length ; i++) {
			System.out.println("k["+i+"] = "+k[i]+", ");
		}
	}
}
