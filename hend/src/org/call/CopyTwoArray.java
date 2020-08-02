package org.call;

public class CopyTwoArray {

	public static void main(String[] args) {
		
		int a[] = {11,2, 33};
		int b[] = { 5,30,2,71};
		
		int c[] = new int[a.length + b.length];
		
		int i=0;
		for(; i<a.length ; i++) {
			c[i] = a[i];
		}
		
		for(int k=0 ; k<b.length ; k++) {
			c[k+i] = b[k];
		}
		
		for(int j=0 ; j<c.length ; j++) {
			System.out.println("c["+j+"] = "+c[j]);
		}
	}
}
