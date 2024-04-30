package in.ashokit.cards;

public class CreditCardPayment  implements ICardPayment{

	public CreditCardPayment() {
		
		System.out.println("constructor");
	}
	
	
	@Override
	public boolean payBill(double amount) {
		
		return false;
	}

}
