package org.inher;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new JuniorStudent();
		student.print();
		
		JuniorStudent juniorStudent = new JuniorStudent();
		juniorStudent.display();
		juniorStudent.print();
	}
}
