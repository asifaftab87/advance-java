package org.arr;

public class ArrayInit {

	public static void main(String[] args) {
		
		int k[] = {22, 4, -1, 5};
		
		System.out.println("length: "+k.length);
		
		for(int i=0 ; i<k.length ; i++) {
			System.out.println("k["+i+"] = "+k[i]);
		}
	}
}
