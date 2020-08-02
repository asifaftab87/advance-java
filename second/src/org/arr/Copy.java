package org.arr;


//wap(write a program) to copy one array to other array
public class Copy {

	public static void main(String[] args) {
		
		int k[] = {22, 4, -1, 5, 12};
		
		int a[] = new int[k.length];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = k[i];
		}
		
		System.out.println("array a");
		a[1] = 200008;
		for(int i=0 ; i<a.length ; i++) {
			System.out.print("  a["+i+"] = "+a[i]);
		}
		
		System.out.println("\narray k");
		for(int i=0 ; i<k.length ; i++) {
			System.out.print("  k["+i+"] = "+k[i]);
		}
	}
}
