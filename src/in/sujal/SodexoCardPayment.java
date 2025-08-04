package in.sujal;

public class SodexoCardPayment implements IPayment {

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Sodexo Card Paymetn Proceess.....");
		return true;
	}

}
