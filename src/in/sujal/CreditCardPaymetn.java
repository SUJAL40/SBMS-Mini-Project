package in.sujal;

public class CreditCardPaymetn implements IPayment {

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Credit Card Paymetn Proceess.....");
		return true;
	}

}
