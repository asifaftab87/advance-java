package oops.hospital.model;

import java.io.Serializable;

public class Hospital implements Serializable{

	private static final long serialVersionUID = -3215058396376145455L;
	
	private int patient;
	private String division;
	private String date;
	private String condition;
	
	
	public int getPatient() {
		return patient;
	}
	public void setPatient(int patient) {
		this.patient = patient;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "petient:	" +patient+ ",	division:	"+division+ ",	date: "+date+ ",	condition:	"+condition;
	}
	
}
