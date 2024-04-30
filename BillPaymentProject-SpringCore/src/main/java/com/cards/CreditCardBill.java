package com.cards;

public class CreditCardBill implements ICardPayment{

	public boolean payBill(double amount) {
		
		System.out.println("Payment done through credit card for Rs. "+ amount);
		
		return true;
	}
}
