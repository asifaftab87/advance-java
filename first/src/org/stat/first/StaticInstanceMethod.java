package org.stat.first;

public class StaticInstanceMethod {

	public static void main(String[] args) {
	
		/*
		 * StatClass statClass = new StatClass();
		 * statClass.print("hello method");
		*/
		
		//display();
		
		StaticInstanceMethod obj = new StaticInstanceMethod();
		obj.display();
	}
	
	
	public void display() {
		System.out.println("hi dilshad");
	}
	
	
}
