package in.sujal;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Debit Card Paymetn Proceess.....");
		return true;
	}

}
