package org.sql.controller;

import java.sql.Date;
import java.util.List;

import org.sql.model.Student;
import org.sql.repository.StudentRepository;
import org.sql.service.StudentService;

public class StudentControl {
	StudentService studentService = null;
	public StudentControl() {
		studentService = new StudentService();
	}
	public static void main(String[] args) {
		StudentControl studentControl = new StudentControl();
		
		//studentControl.addStudent();
		
		//studentControl.update();
		
		//studentControl.findAll();
		
		//studentControl.findByname("Firas");
		
		//studentControl.findByAge(20, 25);
		
		Date fromAdmissionDate = Date.valueOf("2011-01-01");
		Date toAdmissionDate = Date.valueOf("2013-12-31");		
		//studentControl.findByAdmissionDate(fromAdmissionDate, toAdmissionDate);
		
		Date fromGraduateDate = Date.valueOf("2016-01-01");
		Date toGraduateDate = Date.valueOf("2018-01-01");
		//studentControl.findByGraduateDate(fromGraduateDate, toGraduateDate);
	}
	
	
	
	public void addStudent() {
		System.out.println("----------Adding student---------------");
		Student student = new Student();
		student.setName("Yasir");
		student.setStudentId(2558);
		student.setAge(22);
		student.setNationality("Malaysia");
		Date admissionYear = Date.valueOf("2013-09-04");
		student.setAdmissionDate(admissionYear);
		Date graduateYear = Date.valueOf("2018-8-24");
		student.setGraduateDate(graduateYear);
		studentService.add(student);
	}
	
	public void update() {
		studentService.update();
	}
	
	public void findAll() {
		List<Student> studentList = StudentRepository.findAll();
		System.out.println(studentList);
	}
	
	public void findByname(String name) {
		List<Student> studentList = StudentRepository.findByName(name);
		System.out.println(studentList);
	}
	
	public void findByAge(int fromAge, int toAge) {
		List<Student> studentList = StudentRepository.findByAge(fromAge, toAge);
		//for(Student student : studentList) {
			System.out.println(studentList);
	}
		
	public void findByAdmissionDate(Date fromAdmissionDate, Date toAdmissionDate) {
		System.out.println("----------findbyadmission date fromadmissiondate to toadmissiondate---------------");
		List<Student> studentList = StudentRepository.findByAdmissionDate(fromAdmissionDate, toAdmissionDate);
		System.out.println(studentList);
	}
	
	public void findByGraduateDate(Date fromGraduateDate, Date toGraduateDate) {
		System.out.println("----------findbygraduate date fromgraduatedate to tograduatedate---------------");
		List<Student> studentList = StudentRepository.findByGraduateDate(fromGraduateDate, toGraduateDate);
		System.out.println(studentList);
	}
}
