package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.ecom.model.EmployeeOne;
import org.ecom.repository.EmployeeOneRepository;
import org.ecom.util.GetSqlConnection;

public class EmployeeOneService {

private Connection con = null;
	
	public EmployeeOneService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<EmployeeOne> getAllEmployeeOne(){
		
		List<EmployeeOne> employeeOneList = new ArrayList<>();
		
		if(con!=null) {
			employeeOneList = EmployeeOneRepository.getAllEmployeeOne(con);
		}
		
		return employeeOneList;
	}

	public void createEmployeeOne(EmployeeOne employeeOne) {
		EmployeeOneRepository.createEmployeeOne(con, employeeOne);
	}

	public void updateEmployeeOne(EmployeeOne employeeOne) {
		EmployeeOneRepository.updateEmployeeOne(con, employeeOne);
	}

	public EmployeeOne findEmployeeOneById(long id) {
		
		EmployeeOne employeeOne = null;
		
		if(con!=null) {
			employeeOne = EmployeeOneRepository.findEmployeeOneById(con, id);
		}
		
		return employeeOne;
	}
	
	public List<EmployeeOne> getEmployeeOneByName(String name){
		return EmployeeOneRepository.getEmployeeOneByName(con, name);
	}

	public List<EmployeeOne> getEmployeeOneByDob(Date fromDobDate, Date toDobDate) {
		return EmployeeOneRepository.getEmployeeOneByDob(con, fromDobDate, toDobDate);
	}

	public List<EmployeeOne> getEmployeeOneByJoinedDate(Date fromJoinedDate, Date toJoinedDate) {
		return EmployeeOneRepository.getEmployeeOneByJoinedDate(con, fromJoinedDate, toJoinedDate);

	}

	public List<EmployeeOne> getEmployeeOneByReleaseDate(Date fromReleaseDate, Date toReleaseDate) {
		return EmployeeOneRepository.getEmployeeOneByReleaseDate(con, fromReleaseDate, toReleaseDate);

	}

	public List<EmployeeOne> getEmployeeOneByEmailId(String emailId) {
		return EmployeeOneRepository.getEmployeeOneByEmailId(con, emailId);
	}

	public List<EmployeeOne> getEmployeeOneByGender(String gender) {
		return EmployeeOneRepository.getEmployeeOneByGender(con, gender);

	}

	public List<EmployeeOne> getEmployeeOneByNoticePeriod(int noticePeriod) {
		return EmployeeOneRepository.getEmployeeOneByNoticePeriod(con, noticePeriod);
	}

	
	}



