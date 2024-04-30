package in.ashokit.cards;

public class PaymentProcessor {
	
	ICardPayment iPayment;

//	constructor 
	public PaymentProcessor(ICardPayment iPayment) {
		System.out.println("Payment processor constructor");
		this.iPayment = iPayment;
	}

//	setter
	public void setiPayment(ICardPayment iPayment) {
		System.out.println("Setter called");
		this.iPayment = iPayment;
	}
	
	public void doPayment(double amount) {
		
		boolean status = iPayment.payBill(amount);
		
		if(status) {
			System.out.println("Payment successful !");
		}else {
			System.out.println("Payment failed !");
		}
	}
	
	
	
}
