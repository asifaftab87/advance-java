package org.ecom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.EmployeeOne;
import org.ecom.service.EmployeeOneService;

@WebServlet("/EmployeeOneUpdateController")
public class EmployeeOneUpdateController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeOneIdStr = request.getParameter("employeeOneId");
		
		System.out.println("employeeOne update do get employeeOneId: "+employeeOneIdStr);
		
		EmployeeOneService employeeOneService = new EmployeeOneService();
		
		try {
			long employeeOneId = Long.valueOf(employeeOneIdStr);
			EmployeeOne employeeOne = employeeOneService.findEmployeeOneById(employeeOneId);
			
			if(employeeOne!=null) {
				request.setAttribute("employeeOne", employeeOne);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employeeOne-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeOneIdStr = request.getParameter("employeeOneId");
		System.out.println("employeeOne update do get employeeOneId: "+employeeOneIdStr);
		
		String name = request.getParameter("name");
		String dobString = request.getParameter("dob");
		String emailId = request.getParameter("emailId");
		String genderString = request.getParameter("gender");
		String joinedDateString = request.getParameter("joinedDate");
		String releaseDateString = request.getParameter("releaseDate");
		String noticePeriod = request.getParameter("noticePeriod");
	
		
		System.out.println("name: "+name);
		System.out.println("dob : "+dobString);
		System.out.println("emailId: "+emailId);
		System.out.println("gender: "+genderString);
		System.out.println("joinedDate : "+joinedDateString);
		System.out.println("releaseDate : "+releaseDateString);
		System.out.println("noticePeriod: "+noticePeriod);
	
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		EmployeeOneService employeeOneService = new EmployeeOneService();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dob = null;
		Date joinedDate = null;
		Date releaseDate = null;
	

		try {
			
			int employeeOneId = Integer.valueOf(employeeOneIdStr);
			
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	        
	        joinedDate = formatter.parse(joinedDateString);
	        System.out.println(joinedDate);
	        
	        releaseDate = formatter.parse(releaseDateString);
	        System.out.println(releaseDate);
	     
	        
	        
	        EmployeeOne employeeOne = new EmployeeOne();
	        employeeOne.setId(employeeOneId);
	        employeeOne.setDob(dob);
	        employeeOne.setJoinedDate(joinedDate);
	        employeeOne.setReleaseDate(releaseDate);
	        employeeOne.setName(name);
	        employeeOne.setEmailId(emailId);
	        employeeOne.setGender(gender);
	        employeeOne.setNoticePeriod(Integer.valueOf (noticePeriod));

	        employeeOneService.updateEmployeeOne(employeeOne);
        } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
		
		employeeOneService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/asif-project1/employeeOneController/list");  
	}
}


