
package org.ecom.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

@WebServlet("/EmployeeOneSearchJoinController")
public class EmployeeOneSearchJoinController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fromJoinedDate = request.getParameter("fromJoinedDate");
		String toJoinedDate = request.getParameter("toJoinedDate");

		System.out.println("search employee  fromJoinedDate: "+fromJoinedDate);
		System.out.println("search employee  toJoinedDate: "+toJoinedDate);

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	    //Parsing the given String to Date object
	   
		Date fromDate = null;
		Date toDate = null;
		try {
			fromDate = formatter.parse(fromJoinedDate);
		   toDate = formatter.parse(toJoinedDate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		EmployeeOneService employeeOneService = new EmployeeOneService();
		
		try {
			
			List<EmployeeOne> employeeOneList = employeeOneService.getEmployeeOneByJoinedDate(fromDate, toDate );
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
