package org.abstrct;

public class OnlyConcreteAbstrctClassMain {

	public static void main(String[] args) {
		
		OnlyConcreteAbstrctClass obj = new OnlyConcreteAbstrctClassImpl();
		obj.print();
		obj.fun();
	}
}
