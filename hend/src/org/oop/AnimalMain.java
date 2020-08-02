package org.oop;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setFood("vegeterian");
		animal.setName("cow");
		
		System.out.println("cow: "+animal.getName());
		System.out.println("food: "+animal.getFood());
	}
}
