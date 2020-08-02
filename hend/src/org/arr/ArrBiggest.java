package org.arr;

public class ArrBiggest {

	public static void main(String[] args) {
		
		int[] src = {100,2,300,1001,50};
		
		
		int temp = src[0];
		
		for(int i=1 ; i<src.length ; i++) {
			
			
			if(temp < src[i]) {
				temp = src[i];
			}
			
		}
		
		System.out.println("Greatest nunm : "+temp);
	}
	
}
