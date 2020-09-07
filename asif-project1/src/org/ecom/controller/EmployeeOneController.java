package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.EmployeeOne;
import org.ecom.service.EmployeeOneService;


@WebServlet("/EmployeeOneController")
public class EmployeeOneController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EmployeeOneController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employeeOne-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		EmployeeOneService employeeOneService = new EmployeeOneService();
		List<EmployeeOne> employeeOneList = employeeOneService.getAllEmployeeOne();
		
		//send value from java class to jsp 
		request.setAttribute("employeeOneList", employeeOneList);
		employeeOneService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
