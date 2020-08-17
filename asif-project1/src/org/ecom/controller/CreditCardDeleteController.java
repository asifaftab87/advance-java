package org.ecom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.service.CreditCardService;


public class CreditCardDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Cc_IdStr = request.getParameter("Cc_Id");
		System.out.println("Cc_IdStr: "+Cc_IdStr);
		
		CreditCardService creditcardService = new CreditCardService();
		try {
			long Cc_Id = Long.valueOf(Cc_IdStr);
			creditcardService.deleteCreditCardByCc_Id(Cc_Id);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/asif-project1/CreditCard/list");
	}
}

