package dxc;

public class PaymentService {
	
	IPayment payment;
	
	
	public PaymentService() {
		super();
		System.out.println("PaymentService Constructor:: 0-Praram Constructor");
	}

	public PaymentService(IPayment payment){
		this.payment=payment;
	}
	
	public void doPayment(double bill){
		boolean status = payment.processPayment(bill);
		if(status) {
			System.out.println("Payment Successfull...");
		}else {
			System.out.println("Payment Declined..*");
		}
	}
}
