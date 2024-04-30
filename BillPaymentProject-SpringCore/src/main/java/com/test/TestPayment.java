package com.test;

import com.cards.CreditCardBill;
import com.paymentprocessor.PaymentProcessor;

public class TestPayment {

	public static void main(String[] args) {
		
		/* setter injection
		 * PaymentProcessor pp = new PaymentProcessor(); pp.setCardPayment(new
		 * CreditCardBill()); boolean doPayment = pp.doPayment(1300.00);
		 */
		
//		constructor injection
		
		PaymentProcessor p = new PaymentProcessor(new CreditCardBill());
		boolean status = p.doPayment(1200.00);
		
		
		if(status)
			System.out.println("Payment successful !");
		else
			System.out.println("Payment unsuccessful !");
		
	}
}
