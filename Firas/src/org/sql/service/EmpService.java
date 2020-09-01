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
			int age = getAgeFromDate(dob);
			emp.setAge(age);
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
	
	public List<Employee> findByAge(Date fromDobDate, Date toDobDate){
		return EmpRepository.findByAge(fromDobDate, toDobDate);
	}
	
	public static int getAgeFromDate(Date dob) {
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(dob);
		
		int year = calendar.get(Calendar.YEAR);
		//Add one to month {0 - 11}
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		//convert date to age
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		
		int age = Period.between(birth, current).getYears();
		return age;
	}
	
	public void create(Employee employee) {
		
		EmpRepository.create(employee);
	}
	
	public static void update() {
		EmpRepository.update();
	}
}
