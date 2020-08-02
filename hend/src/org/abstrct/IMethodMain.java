package org.abstrct;

public class IMethodMain {

	public static void main(String[] args) {
		
		IMethod im = new IMethodImpl();
		
		im.print();
		im.fun();
		System.out.println("value of s: "+IMethod.s);
	}
}
