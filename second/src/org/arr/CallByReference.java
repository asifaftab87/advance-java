package org.arr;

public class CallByReference {

	//call by reference
public static void main(String[] args) {
		
		int k[] = {22, 4, -1, 5, 12};
		
		int a[] = k;
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		a[2] = 100;
		
		for(int i=0 ; i<k.length ; i++) {
			System.out.println("k["+i+"] = "+k[i]);
		}
	}
}
