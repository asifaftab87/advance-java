package org.inhert;

public class Street extends City{

	int id;
	
	public Street() {
		super(44);
		System.out.println("Street constructor");
	}
	
	public void disp() {
		System.out.println("disp id: "+id);
		super.id = 6;
		super.method();
	}
	
	@Override
	public void method() {
		System.out.println("child method  id: "+id);
	}
}
