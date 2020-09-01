package org.sql.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.sql.model.Employee;
import org.sql.repository.EmpRepository;

public class EmpService {
	public EmpService() {
		EmpRepository.ConnectionOpen();
	}
	
	public List<Employee> findAll(){
		List<Employee> empList = EmpRepository.findAll();
		for(Employee emp : empList) {
			Date dob = emp.getDob();
			//int age = getAgeFromDate(dob);
			//emp.setAge(age);
		}
		return empList;
	}
	public List<Employee> findByName(String name){
		List<Employee> empList = EmpRepository.findByName(name);
		return empList;
	}
	
	public Employee findById(int id){
		return EmpRepository.findById(id);
	}
	
	public Employee findByEmailId(String emailId) {
		return EmpRepository.findByEmailId(emailId);
	}
	public List<Employee> findByDob(Date fromDobDate, Date toDobDate){
		return EmpRepository.findByDob(fromDobDate, toDobDate);
	}
	
	public List<Employee> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return EmpRepository.findByJoinedDate(fromJoinedDate, toJoinedDate);
	}
	
	public List<Employee> findByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return EmpRepository.findByReleaseDate(fromReleaseDate, toReleaseDate);
	}
	
	public List<Employee> findByNoticePeriod(int noticePeriod){
		return EmpRepository.findByNoticePeriod(noticePeriod);
	}
	
	public List<Employee> findByGender(String gender){
		return EmpRepository.findByGender(gender);
	}
	
	
	public void create(Employee employee) {
		
		EmpRepository.create(employee);
	}
	
	public static void update() {
		EmpRepository.update();
		Employee employee = new Employee();
		employee.setCreateDate(new Date(new java.util.Date().getTime()));
		employee.setUpdateDate(new Date(new java.util.Date().getTime()));
	}
}
