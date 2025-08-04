package in.sujal;

public class App {

	public static void main(String[] args) {
		IPayment ip = new CreditCardPaymetn();
		PaymentService service = new PaymentService(ip);
		service.doPayment(450.00);

	}

}
