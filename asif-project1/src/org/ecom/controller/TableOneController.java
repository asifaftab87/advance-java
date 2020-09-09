package org.ecom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;


public class TableOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TableOneController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "TableOne.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);

		//send value from java class to jsp 
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}