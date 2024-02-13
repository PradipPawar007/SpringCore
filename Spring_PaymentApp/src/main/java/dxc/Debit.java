package dxc;

public class Debit implements IPayment {

	public Debit() {
		System.out.println("Debit Constructor:: 0-Praram Constructor");
	}
	
	@Override
	public boolean processPayment(double bill) {
		System.out.println("Debit Card Payment Successfull....");
		return true;
	}

}
