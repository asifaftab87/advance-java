package org.abst;

public class CalculateCirlcleImplMain {

	public static void main(String[] args) {
		
		CalculateCirlcle circle = new CalculateCirlcleImpl();
		double area = circle.area(3);
		double perimeter = circle.perimeter(3);
		
		System.out.println("area: "+area);
		System.out.println("perimeter: "+perimeter);
		
		CalculateBox cb = new CalculateCirlcleImpl();
		int volume = cb.volume(1, 2, 3);
		System.out.println("volume: "+volume);
	}
}
