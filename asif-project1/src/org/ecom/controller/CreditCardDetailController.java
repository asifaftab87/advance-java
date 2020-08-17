package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Address;
import org.ecom.model.CreditCard;
import org.ecom.service.AddressService;
import org.ecom.service.CreditCardService;;

public class CreditCardDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Cc_IdStr = request.getParameter("Cc_Id");
		
		System.out.println("CreditCard detail do get Cc_Id: "+Cc_IdStr);
		
		CreditCardService creditcardsevice = new CreditCardService();
		
		try {
			long Cc_Id = Long.valueOf(Cc_IdStr);
			List<CreditCard> creditcard = creditcardsevice.findCreditCardByCc_Id(Cc_Id);
			
			if(creditcard!=null) {
				
				//pass value to jsp 
				request.setAttribute("creditcard", creditcard);
				AddressService addressService = new AddressService();
				List<Address> addressList = addressService.findAddressByEmployeeId(Cc_Id);
				request.setAttribute("addressList", addressList);
			}
				
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		
	}
		
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employee-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	
	}

}
