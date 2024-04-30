package in.ashokit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.cards.PaymentProcessor;
public class PaymentApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
		PaymentProcessor pp = (PaymentProcessor)c.getBean("paymentProcessor");
		pp.doPayment(1200.00);
		
		
	}
}
