package org.get.set;

public class StudentMain {

	public static void main(String [] ar) {
	
		Student s1 = new Student();
		s1.setAddr("park");
		s1.setEmail("asif@mail.com");
		s1.setName("dilshad");
		s1.setRoll(1);
		
		Student s2 = new Student("second object");
		s2.setAddr(s1.getAddr());
		s2.setEmail(s1.getEmail());
		s2.setName(s1.getName());
		s2.setRoll(s1.getRoll());
		
		System.out.println("roll: "+s2.getRoll());
		System.out.println("name: "+s2.getName());
		System.out.println("addr: "+s2.getAddr());
		System.out.println("email: "+s2.getEmail());
	}
	
}
