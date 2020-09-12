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
import org.liferayasif.model.Task;
import org.liferayasif.service.TaskService;


@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaskServlet() {
        super();
       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("-----------------doGet TaskServlet");		
		String destination = "task-example.jsp";
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-----------------doPost TaskServlet");
		
		//for connection
		TaskService taskService = new TaskService();
		Task task = new Task();
		String name = request.getParameter("name");
		System.out.println("name: "+name);
		task.setName(name);
		String emailId = request.getParameter("emailId");
		System.out.println("emailid: "+emailId);
		task.setEmailId(emailId);
		
		//gender
		String gender = request.getParameter("gender");
		System.out.println("gender: "+gender);
		boolean b1=Boolean.parseBoolean(gender); 
		task.setGender(b1);
		
		//dob
		String dob = request.getParameter("dob");
		System.out.println("dob: "+dob);
		SimpleDateFormat dobFormat = new SimpleDateFormat("MM/dd/yyyy");
		try {
			java.util.Date utilDate = dobFormat.parse(dob);
			Date sqlDate = new Date(utilDate.getTime());
			task.setDob(sqlDate);
		} 
		catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		//age
		String age = request.getParameter("age");
		System.out.println("age: "+age);
		Integer ageInt = Integer.parseInt(age);
		task.setAge(ageInt);

		
		System.out.println("doPost-----------------");
		String destination = "result.jsp";
		
		taskService.create(task);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
