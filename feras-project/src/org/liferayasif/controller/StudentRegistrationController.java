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

import org.liferayasif.model.Student;
import org.sql.util.StudentSql;

/**
 * Servlet implementation class StudentRegistrationController
 */
@WebServlet("/StudentRegistrationController")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("StudentRegistrationController.doGet");
		
		String destination = "registration-form.jsp";
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("StudentRegistrationController.doPost");
		
		StudentSql.ConnectionOpen();

		String name = request.getParameter("fullName");
		System.out.println("name: "+name);
		
		String svName = request.getParameter("svName");
		System.out.println("Sv Name: "+svName);
		
		String studentId = request.getParameter("studentId");
		System.out.println("student Id: "+studentId);
		
		String email = request.getParameter("email");
		System.out.println("email: "+email);
		
		//dob
		String dob = request.getParameter("dob");
		System.out.println("dob: "+dob);
		SimpleDateFormat dobFormat = new SimpleDateFormat("MM/dd/yyyy");
		Student student = new Student();
		
		try {
			java.util.Date utilDate = dobFormat.parse(dob);
			Date sqlDate = new Date(utilDate.getTime());
			student.setDob(sqlDate);
		} 
		catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		String gender = request.getParameter("gender");
		System.out.println("gender: "+gender);
		
		String course = request.getParameter("course");
		System.out.println("course: "+course);
		
		String destination = "student-result.jsp";
		
		student.setName(name);
		student.setSvName(svName);
		student.setStudentId(Integer.valueOf(studentId));
		student.setEmail(email);
		
		student.setGender(gender);
		student.setCourse(course);
		
		StudentSql.create(student);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
