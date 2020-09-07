package oops.emp.service;

import java.util.List;

import oops.emp.model.Employee;
import oops.emp.repository.EmployRepository;

public class EmployeeService {

	public EmployeeService() {
		EmployRepository.createEmployList();
	}
	
	public static List<Employee> findAll() {
		return EmployRepository.findAll();
	}
	
	public static void addEmployee(Employee employee) {
		EmployRepository.addEmployee(employee);
	}
	
	public static void deleteEmployee(int index) {
		EmployRepository.deleteEmployee(index);
	}
	
	public static Employee findById(int id) {
		return EmployRepository.findById(id);
	}
}
