package org.inhert;

public class ParentMain {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.shared();
		
		Child child = new Child();
		child.kid();
		child.shared();
	}
}
