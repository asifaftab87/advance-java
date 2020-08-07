package org.ecom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.User;
import org.ecom.service.UserService;

public class UserCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "user-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("user add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String genderString = request.getParameter("gender");
		String fatherName = request.getParameter("fatherName");
		
		System.out.println("fatherName: "+fatherName);
		System.out.println("firstName: "+firstName);
		System.out.println("lName: "+lName);
		System.out.println("email: "+email);
		System.out.println("dob: "+dobString);
		System.out.println("gender: "+genderString);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		UserService userService = new UserService();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		Date dob = null;
		
		try {
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	         
	        User user = new User();
	 		user.setDob(dob);
	 		user.setFirstName(firstName);
	 		user.setLastName(lName);
	 		user.setFatherName(fatherName);
	 		user.setGender(gender);
	 		user.setEmail(email);
	 		userService.createUser(user);
	 		
        } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
		
		userService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/asif-project1/user/list");  
	}
	
}