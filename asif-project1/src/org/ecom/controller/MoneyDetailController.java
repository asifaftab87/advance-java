package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.MoneyDetail;
import org.ecom.service.MoneyDetailService;

public class MoneyDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("MoneyDetailController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "MoneyDetail-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		MoneyDetailService moneydetService = new MoneyDetailService();
		List<MoneyDetail> moneydetList = moneydetService.getAllMoneyDetail();
		
		//send value from java class to jsp 
		request.setAttribute("moneydetList", moneydetList);
		moneydetService.connectionClose();
		
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
