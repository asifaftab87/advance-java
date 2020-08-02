package org.abst;

public class BuilderMain {

	public static void main(String[] args) {
		
		Building building = new Builder();
		building.block();
		int f = building.floor();
		System.out.println(f);
	}
}
