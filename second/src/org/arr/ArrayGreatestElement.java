package org.arr;

//find greatest number from an array element
public class ArrayGreatestElement {

	public static void main(String[] args) {
		
		int k[] = {-22, -400, -1000, -5};
		
		int g = k[0];
		
		for(int i=1 ; i<k.length ; i++) {
			if(g<k[i]) {
				g = k[i];
			}
		}
		System.out.println("greatest: "+g);
	}
}
