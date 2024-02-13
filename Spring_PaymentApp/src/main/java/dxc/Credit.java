package dxc;

public class Credit implements IPayment {
	
	public Credit() {
		System.out.println("Credit Constructor:: 0-Praram Constructor");
	}

	@Override
	public boolean processPayment(double bill) {
		System.out.println("Credit Card Payment Successfull....");
		return true;
	}

}
