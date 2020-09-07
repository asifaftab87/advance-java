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


@WebServlet("/EmployeeOneSearchNoticePeriodController")
public class EmployeeOneSearchNoticePeriodController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String noticePeriodString = request.getParameter("noticePeriod");

		System.out.println("search employeeOne by noticePeriod: "+noticePeriodString);
		
		int noticePeriod= Integer.valueOf(noticePeriodString);
		System.out.println("noticePeriod: "+noticePeriod);
		
		EmployeeOneService employeeOneService = new EmployeeOneService();
		
		try {
			
			List<EmployeeOne> employeeOneList = employeeOneService.getEmployeeOneByNoticePeriod(noticePeriod);
			request.setAttribute("employeeOneList", employeeOneList);
			employeeOneService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employeeOne-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}	

}
