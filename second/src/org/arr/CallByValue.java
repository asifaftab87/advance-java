package org.arr;

//call by value
public class CallByValue {

	public static void main(String[] args) {
		
		int a=1; 
		int b=a;
		
		System.out.println(a);
		System.out.println(b);
		
		b =44;
		
		System.out.println(a);
		System.out.println(b);
	}
}
