package org.inhert.override;

public class Child extends Parent{

	@Override	//annotation
	public void weight() {
		System.out.println("child weight 50 kg");
	}
}
