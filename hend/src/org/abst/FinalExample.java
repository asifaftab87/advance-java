package org.abst;

public class FinalExample {

	public static void main(String[] args) {
		
		int radius = 2;
		
		final double pi = 3.14;
		
		double areaOfCircle = calculateAreaOfCircle(pi, radius);
		
		System.out.println("area of a circle: "+areaOfCircle);
		
		radius = 4;
		
		System.out.println("area of a circle: "+calculateAreaOfCircle(pi, radius));
				
	}
	
	public static double calculateAreaOfCircle(double pi, int radius) {
		return pi * radius * radius;
	}
}
