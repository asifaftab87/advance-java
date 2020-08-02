package org.stat;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.id = 5;
		Student.country = "USA";
		s2.id = 66;
		Student.country = "China";
		s3.id = 33;
		Student.country = "Japan";
		
		System.out.println("id1: "+s1.id);
		System.out.println("id2: "+s2.id);
		System.out.println("id3: "+s3.id);
		
		s1.print();
		s1.print();
		s1.print();
		Student.statDisplay();
		
		System.out.println("country1: "+Student.country);
	}
}
