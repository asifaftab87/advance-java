package org.arr;

public class CopyArr {

	public static void main(String[] args) {
		
		int[] src = {1,2,3,43,1,5};
		
		int dest[] = new int[src.length];
			
		for(int i=0 ; i<dest.length ; i++) {
			dest[i] = src[i];
		}
		
		for(int i=0 ; i<dest.length ; i++) {
			System.out.println(dest[i]);
		}
	}
}
