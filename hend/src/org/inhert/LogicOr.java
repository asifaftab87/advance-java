package org.inhert;

public class LogicOr {

	public static void main(String[] args) {
		 
		boolean b = true;
		boolean a = false;
		
		boolean x = a && b;			//logical and
		
		boolean y = a || b;			//logical or
		
		boolean z = !a;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
	}
}
