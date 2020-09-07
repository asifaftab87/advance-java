package oops.emp.controller;

import java.util.List;

import oops.emp.model.Employee;
import oops.emp.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		System.out.println("fetching the list:");
		List<Employee> empList = EmployeeService.findAll(); 
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
		System.out.println("\nadd a new employee");
		List<Employee> empList2 = EmployeeService.findAll();
		for(Employee emp1 : empList2) {
			System.out.println(emp1);
		}
		
		Employee employee = new Employee();
		employee.setId(9);
		employee.setName("Hamza");
		employee.setCompanyName("intel");
		employee.setDateOfJoining("sept 2");
		
		System.out.println(employee);
//---------------------------------------------------------------
		System.out.println("\ndelete an employee");
		empList2.remove(1);
		for(Employee emp2 : empList2) {
			System.out.println(emp2);
		}
		
	}
}
