package oops.emp.repository;

import java.util.ArrayList;
import java.util.List;

import oops.emp.model.Employee;

public class EmployRepository {

	private static List<Employee> employeeList = new ArrayList<>();				// initialize a list
	
	public static void createEmployList() {					// default constructor
		
		Employee employee = new Employee();			// object
		employee.setId(5);
		employee.setName("asif");
		employee.setCompanyName("averis");
		employee.setDateOfJoining("July 3");
		
		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setName("feras");
		employee2.setCompanyName("student");
		employee2.setDateOfJoining("June 30");
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("atif");
		employee3.setCompanyName("accenture");
		employee3.setDateOfJoining("August 12");
		
		
		Employee employee4 = new Employee();
		employee4.setId(9);
		employee4.setName("jawed");
		employee4.setCompanyName("home");
		employee4.setDateOfJoining("Jan 11");
		
		employeeList.add(employee);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
	}
	
	public static List<Employee> findAll(){
		return employeeList;
	}
	
	public static void addEmployee(Employee employee) {		// pass Employee object 'Employee employee'
		
		System.out.println("\nemployee added\n");
		employeeList.add(employee);
		return;
	}
	
	public static void deleteEmployee(int index) {

		System.out.println("\nemployee deleting\n");
		employeeList.remove(index);
	}
		
	public static Employee findById(int id) {
		
		for(Employee emp : employeeList) {
			
			if(id==emp.getId()) {
				return emp;
			}
		}
		return null;
	}
}


