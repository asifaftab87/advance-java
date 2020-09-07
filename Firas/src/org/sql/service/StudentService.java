package org.sql.service;

import java.sql.Date;
import java.util.List;

import org.sql.model.Student;
import org.sql.repository.StudentRepository;

public class StudentService {
	public StudentService(){
		StudentRepository.ConnectionOpen();
	}
	
	public void add(Student student) {
		StudentRepository.add(student);
	}
	
	public void update() {
		StudentRepository.update();
	}
	
	public List<Student> findAll(){
		List<Student> studentList = StudentRepository.findAll();
		for(Student student : studentList) {
		}
		return studentList;
	}
	
	public List<Student> findByName(String name){
		return StudentRepository.findByName(name);
	}
	
	public Student findByStudentId(int studentId) {
		return StudentRepository.findByStudentId(studentId);
	}
	
	public List<Student> findByAdmissionDate(Date fromAdmissionDate, Date toAdmissionDate){
		return StudentRepository.findByAdmissionDate(fromAdmissionDate, toAdmissionDate);
	}
}
