package org.oop;

public class MainBulb {

	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		
		bulb.set(true, 12.0);
		boolean status = bulb.statusOfBulb();
		double volt = bulb.getVolt();
		
		System.out.println("status: "+status);
		System.out.println("volt: "+volt);
		
	}
}
