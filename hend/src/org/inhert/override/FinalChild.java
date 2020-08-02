package org.inhert.override;

public class FinalChild extends FinalParent{

	//final method can't override by child
/*
	@Override
	public void personal() {
		System.out.println("child personal");
	}
*/
	@Override
	public void shared() {
		System.out.println("child shared");
	}
}
