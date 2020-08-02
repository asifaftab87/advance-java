package org.abst;

public class CalculateCirlcleImpl implements CalculateCirlcle, CalculateBox{

	@Override
	public double area(int r) {
		return pi * r * r;
	}

	@Override
	public double perimeter(int r) {
		return 2 * pi * r;
	}

	@Override
	public int volume(int length, int breadth, int height) {
		return length * breadth * height;
	}

}
