package com.cards;

public class DebitCardBill implements ICardPayment {

	public boolean payBill(double amount) {
		
		System.out.println("Payment done through debit card Rs. "+ amount);
		return true;
	}
}
