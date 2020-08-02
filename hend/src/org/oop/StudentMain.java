package org.oop;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student.schoolName = "wahed";
		s1.name = "asif";

		Student.schoolName = "md jan";
		s2.name = "jawed";
		
		Student.schoolName = "murshidabad";
		s3.name = "alam";
		
		s1.print();
		s2.print();
		s3.print();
	}
}
