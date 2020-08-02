package org.inher;

public class MainInher {

	public static void main(String[] ss) {
	
		C c = new C();
		
		System.out.println("sum: "+c.sum(1, 2));
		System.out.println("sub: "+c.sub(15, 2));
		System.out.println("prod: "+c.prod(3, 4));
		System.out.println("div: "+c.div(6, 2));
		System.out.println("reminder: "+c.reminder(10, 2));
		
	}
}
