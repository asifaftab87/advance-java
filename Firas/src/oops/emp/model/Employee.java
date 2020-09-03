package oops.emp.model;

import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private String companyName;
	private String dateOfJoining;
	private Date dob;
	
	public Employee() {}		// constructor

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String toString() {
		return "id: " +id+ ",	name: " +name+ ",	company name: " +companyName+ ",	date of joining: " +dateOfJoining+ ",	dob: " +dob;
	}
	
}
