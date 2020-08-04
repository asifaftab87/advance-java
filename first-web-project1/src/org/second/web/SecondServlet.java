package org.second.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.SqlUtil;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SecondServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String brand = request.getParameter("brand");
		
		String horsepower = request.getParameter("horsepower");
		
		String average = request.getParameter("average");
		
		String colour = request.getParameter("colour");
		System.out.println("------------this is my do post method---------------");
		System.out.println("brand: "+brand);
		System.out.println("horsepower: "+horsepower);
		System.out.println("average: "+average);
		System.out.println("colour: "+colour);
		SqlUtil.connectionOpen();
		
		SqlUtil.create(brand, Integer.valueOf(horsepower), Float.valueOf(average),colour);
		
		String destination = "/WEB-INF/result.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
		doGet(request, response);
	}

}
