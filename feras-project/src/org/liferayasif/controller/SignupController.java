package org.liferayasif.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.liferayasif.model.Signup;
import org.liferayasif.service.SignupService;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//SignupRepository SignupServiceObj = new SignupRepository();

	public SignupController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("-----------------doGet SignupController");
		String destination = "student-signup.jsp";

		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);

		try {
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("-------------doPost");
		SignupService signupService = new SignupService();
		
		Signup signup = new Signup();
		String name = request.getParameter("name");
		System.out.println("name: " + name);
		signup.setName(name);

		// String to integer
		String studentid = request.getParameter("studentid");
		System.out.println("studentid: " + studentid);
		Integer idInt = Integer.parseInt(studentid);
		signup.setStudentid(idInt);

		String emailid = request.getParameter("emailid");
		System.out.println("emaildId: " + emailid);
		signup.setEmailid(emailid);
		String repeatEmail = request.getParameter("emailid");
		System.out.println("emailid: " + repeatEmail);
		signup.setRepeatEmail(repeatEmail);

		String password = request.getParameter("pwd");
		System.out.println("pwd: " + password);
		signup.setPassword(password);
		String repeatPassword = request.getParameter("pwd");
		System.out.println("pwd: " + repeatPassword);
		signup.setRepeatPassword(repeatPassword);

		// String to integer
		String contact = request.getParameter("phone");
		System.out.println("phone: " + contact);
		Integer contactInt = Integer.parseInt(contact);
		signup.setContact(contactInt);

		// string to date
		String dob = request.getParameter("dob");
		System.out.println("dob: " + dob);
		SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy");
		// util.Date to sql.Date
		try {
			java.util.Date utilDate = date1.parse(dob);
			Date sqlDate = new Date(utilDate.getTime());
			signup.setDob(sqlDate);
		} catch (ParseException e1) {
			// 
			e1.printStackTrace();
		}
		
		String gender = request.getParameter("gender");
		System.out.println("gender: " +gender);

		String course = request.getParameter("course");
		System.out.println("course: " + course);
		signup.setCourse("course: " + course);

		System.out.println("-----------------doPost SingupController");
		String destination = "signup-result.jsp";

		signupService.create(signup);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);

		try {
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
