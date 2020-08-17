package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.CreditCard;
import org.ecom.repository.CreditCardRepository;
import org.ecom.util.GetSqlConnection;

public class CreditCardService {

	private Connection con = null;

	public CreditCardService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<CreditCard> getAllCreditCard() {

		List<CreditCard> CreditCardList = new ArrayList<>();

		if (con != null) {
			CreditCardList = CreditCardRepository.getAllCreditCard(con);
		}

		return CreditCardList;
	}

	public List<CreditCard> findCreditCardByCc_Id(long Cc_Id) {

		List<CreditCard> CreditCardList = new ArrayList<>();

		if (con != null) {
			CreditCardList = CreditCardRepository.findCreditCardByCc_Id(con, Cc_Id);
		}

		return CreditCardList;
	}
	
	public int deleteCreditCardByCc_Id(long Cc_Id) {
		return CreditCardRepository.deleteCreditCardByCc_Id(con, Cc_Id);
	}

	public void createCreditCard(CreditCard creditcard) {
		CreditCardRepository.createCreditCard(con, creditcard);
	}

	public void updateCreditCard(CreditCard creditcard) {
		CreditCardRepository.updateCreditCard(con, creditcard);
	}
	
	public List<CreditCard> getCreditCardByHolder_name(String hname) {
		return CreditCardRepository.getCreditCardByHolder_name(con, hname);
	}
}