package org.arr;


//wap(write a program) to copy one array to other array in reverse order
public class ReverseCopy {

	public static void main(String[] args) {
		
		int k[] = {22, 4, -1, 5, 12};
		
		int a[] = new int[k.length];
		
		for(int i=0, j=a.length-1; i<a.length ; i++, j--) {
			a[i] = k[j];
		}
		
		System.out.println("array a");
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print("  a["+i+"] = "+a[i]);
		}
		
		System.out.println("\narray k");
		for(int i=0 ; i<k.length ; i++) {
			System.out.print("  k["+i+"] = "+k[i]);
		}
	}
}
