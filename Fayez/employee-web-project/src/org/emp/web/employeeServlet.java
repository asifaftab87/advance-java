package org.emp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.emp.sql.util.sqlUtil;


@WebServlet("/emp")
public class employeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String EmpId=request.getParameter("id");
		String firstName=request.getParameter("fname");
		String email=request.getParameter("em");
		String jobTitle=request.getParameter("tit");
		
		
		System.out.println("----this is my get	method----");
		System.out.println("EmpId: "+EmpId);
		System.out.println("fname: "+firstName);
		System.out.println("email: "+email);
		System.out.println("jobTitle: "+jobTitle);
		
		
		sqlUtil.ConnectionOpen();
		sqlUtil.create(Integer.valueOf(EmpId),firstName,email,jobTitle);
		String destination = "/WEB-INF/lib/result.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String EmpId=request.getParameter("id");
		String firstName=request.getParameter("fname");
		String email=request.getParameter("em");
		String jobTitle=request.getParameter("tit");
		
		
		System.out.println("----this is my post	method----");
		System.out.println("EmpId: "+EmpId);
		System.out.println("fname: "+firstName);
		System.out.println("email: "+email);
		System.out.println("jobTitle: "+jobTitle);
		
		
		sqlUtil.ConnectionOpen();
		sqlUtil.create(Integer.valueOf(EmpId),firstName,email,jobTitle);
		String destination = "/WEB-INF/lib/result.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	
	}

}
