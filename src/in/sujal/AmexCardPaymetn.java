package in.sujal;

public class AmexCardPaymetn implements IPayment {

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Amex Card Payment Proceess.....");
		return true;
	}

}
