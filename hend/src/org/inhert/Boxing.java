package org.inhert;

public class Boxing {

	public static void main(String[] args) {
		
		int k = 5;
		
		Integer in = new Integer(k);		//boxing
		
		System.out.println(in);
		
		int i = in;					//un boxing
		
		System.out.println(i);
	}
}
