package org.abst;

public class Builder implements Building{

	@Override
	public void block() {
		System.out.println("this is block method");
	}

	@Override
	public int floor() {
		System.out.println("this is sum method");
		return 5;
	}

}
