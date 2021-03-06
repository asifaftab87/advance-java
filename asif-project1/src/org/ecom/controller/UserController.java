package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.User;
import org.ecom.service.UserService;

public class UserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("UserController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "user-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		UserService userService = new UserService();
		List<User> userList = userService.getAllUser();
		
		//send value from java class to jsp 
		request.setAttribute("userList", userList);
		userService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
