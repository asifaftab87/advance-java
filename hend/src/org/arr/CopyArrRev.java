package org.arr;

public class CopyArrRev {

	public static void main(String[] args) {
		
		int[] src = {1,2,3,11,50};
		
		int dest[] = new int[src.length];
			
		for(int i=0 ; i<dest.length ; i++) {
			dest[dest.length-1-i] = src[i];
		}
		
		for(int i=0 ; i<dest.length ; i++) {
			System.out.println("dest["+i+"]"+dest[i]);
		}
	}
}
