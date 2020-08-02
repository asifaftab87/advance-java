package org.inher;

public class C extends B{

	public C() {
		System.out.println("constructor C");
	}
	
	public int reminder(int n, int d) {
		return n%d;
	}
}
