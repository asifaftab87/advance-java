package org.ecom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.CreditCard;
import org.ecom.service.CreditCardService;

public class CreditCardUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Cc_IdStr = request.getParameter("Cc_Id");
		
		System.out.println(" CreditCard update do get Cc_Id: "+Cc_IdStr);
		
		CreditCardService creditcardService = new CreditCardService();
		
		try {
			long Cc_Id = Long.valueOf(Cc_IdStr);
			List<CreditCard> creditcard = creditcardService.findCreditCardByCc_Id(Cc_Id);
			
			if(creditcard!=null) {
				request.setAttribute("creditcard", creditcard);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Cc_IdStr = request.getParameter("cc_id");
		
		System.out.println("Creditcard update do get Cc_Id: "+Cc_IdStr);
		String Cc_numString = request.getParameter("cc_num");
		String Holder_nameString = request.getParameter("hname");
		String Expiry_Date = request.getParameter("Edate");

		System.out.println("cc_num: " + Cc_numString);
		System.out.println("holder_name: " + Holder_nameString);
		System.out.println("Expiry_Date: " + Expiry_Date);
		
	
		CreditCardService creditcardService = new CreditCardService();

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		Date Edate = null;

		try {
			
			int Cc_Id = Integer.valueOf(Cc_IdStr); 
			
			Edate = formatter.parse(Expiry_Date);
			System.out.println(Edate);

			CreditCard creditcard = new CreditCard();
			creditcard.setCc_id(Cc_Id);
			creditcard.setCc_num(String.valueOf(Cc_numString));
			creditcard.setHolder_name(String.valueOf(Holder_nameString));
			creditcard.setExpiry_date(Edate);
			creditcardService.updateCreditCard(creditcard);

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		creditcardService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/asif-project1/CreditCard/list");
	}

}
