package com.cards;

public class ZetaCardPayment implements ICardPayment{
	
	public boolean payBill(double amount) {
		System.out.println("Payment done through zeta card for Rs . "+ amount);
		
		return true;
	}

}
