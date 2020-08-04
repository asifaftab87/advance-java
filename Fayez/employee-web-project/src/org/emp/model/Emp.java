package org.emp.model;

import java.io.Serializable;


	public class Emp implements Serializable {

		private static final long serialVersionUID = -1443814004539007341L;
		
	private int Emp_id;
	private String first_name;
	private String email;
	private String jobTitle;



	public Emp() {}



	public int getEmp_id() {
		return Emp_id;
	}



	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	}