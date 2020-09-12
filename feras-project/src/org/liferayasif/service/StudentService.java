package org.liferayasif.service;


import org.liferayasif.model.Student;
import org.liferayasif.repository.studentRepository;

public class StudentService {
	public StudentService(){
		studentRepository.ConnectionOpen();
	}
	
	public void create(Student student) {
		studentRepository.create(student);
	}
	
	public void update() {
		//studentRepository.update();
	}
	
	/*public List<Student> findAll(){
		List<Student> studentList = StudentRepository.findAll();
		for(Student student : studentList) {
		}
		return studentList;
	}*/
	
	/*public List<Student> findByName(String name){
		return StudentRepository.findByName(name);
	}*/
	
	/*public Student findByStudentId(int studentId) {
		return StudentRepository.findByStudentId(studentId);
	}*/
	
	/*public List<Student> findByAdmissionDate(Date fromAdmissionDate, Date toAdmissionDate){
		return StudentRepository.findByAdmissionDate(fromAdmissionDate, toAdmissionDate);
	}*/
}
