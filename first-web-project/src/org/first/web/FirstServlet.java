package org.first.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.first.sql.util.SqlUtil;


public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("pwd");
		String age = request.getParameter("age");
		
		System.out.println("------------this is my do get method---------------");
		System.out.println("fname: "+firstName);
		System.out.println("lname: "+lname);
		System.out.println("password: "+password);
		System.out.println("age: "+age);

		String destination = "/WEB-INF/result.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		String age = request.getParameter("age");
		
		System.out.println("------------this is my do post method---------------");
		System.out.println("name: "+name);
		System.out.println("age: "+age);

		SqlUtil.connectionOpen();
		SqlUtil.create(name, Integer.valueOf(age));
		
		String destination = "/WEB-INF/result.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
		
	}

}
