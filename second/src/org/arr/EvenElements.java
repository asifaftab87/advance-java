package org.arr;


//wap(write a program) to print only even num from an array
public class EvenElements {

	public static void main(String[] args) {
		
		int k[] = {22, 4, -1, 5};
		
		//System.out.println("length: "+k.length);
		
		for(int i=0 ; i<k.length ; i++) {
			if(k[i]%2==0) {
				System.out.println("k["+i+"] = "+k[i]);
			}
		}
	}
}
