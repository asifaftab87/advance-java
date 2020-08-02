package org.call;

public class ArrayOperations {

	
	public static void main(String[] args) {
		
		int src[] = {2, 1, 5};
		
		int dest[] = new int[src.length];
		
		for(int k=0 ; k<dest.length ; k++) {
			System.out.print(dest[k]+" ");
		}
		
		copy(src, dest);
		System.out.println("");
		System.out.println(src);
		
		for(int k=0 ; k<dest.length ; k++) {
			System.out.print(dest[k]+" ");
		}
		
		int x = 4;
		func(x);
		System.out.println("x: "+x);  //4 or 20
		
		int t[] = copy(src);
		for(int k=0 ; k<t.length ; k++) {
			System.out.print(t[k]+" ");
		}
	}
	
	
	//copy array
	public static void copy(int[] s, int[] d) {
		
		for(int k=0 ; k<s.length ; k++) {
			d[k] = s[k];
		}
	}
	
	public static int[] copy(int[] s) {
		
		int a[] = new int[s.length];
		
		for(int k=0 ; k<s.length ; k++) {
			a[k] = s[k];
		}
		
		return a;
	}
	
	public static void func(int y) {
		System.out.println("\ny: "+y);
		y = 20;
	}
	
}
