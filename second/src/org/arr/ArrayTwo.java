package org.arr;

public class ArrayTwo {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int v = 5;
		
		System.out.println("v: "+v);
		System.out.println("address: "+arr);
		
		arr[0] = 20;
		arr[1] = 2;
		arr[2] = -1;
		arr[3] = 100;
		arr[4] = 33;
		
		System.out.println("arr: "+arr[0]);
		System.out.println("arr: "+arr[1]);
		System.out.println("arr: "+arr[2]);
		System.out.println("arr: "+arr[3]);
		System.out.println("arr: "+arr[4]);
		
	}
}
