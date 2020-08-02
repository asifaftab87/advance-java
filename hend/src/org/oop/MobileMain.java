package org.oop;

public class MobileMain {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.setIsOn(true);
		mobile.setVolt(13.22);
		
		System.out.println("volt: "+mobile.getVolt());
		System.out.println("ison: "+mobile.getIsOn());
		
		Mobile mobile2 = new Mobile();
		
		mobile2.setIsOn(false);
		mobile2.setVolt(3.92);
		
		System.out.println("volt: "+mobile2.getVolt());
		System.out.println("ison: "+mobile2.getIsOn());
	}
}
