package com.paymentprocessor;

import com.cards.ICardPayment;

//import com.cards.CreditCardBill;
//import com.cards.DebitCardBill;
//import com.cards.ICardPayment;
//import com.cards.ZetaCardPayment;

public class PaymentProcessor {

	ICardPayment cardPayment = null;

//	constructor
	public PaymentProcessor(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

//	setter
	public void setCardPayment(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public boolean doPayment(double amount) {

		return cardPayment.payBill(amount);
	}
}
