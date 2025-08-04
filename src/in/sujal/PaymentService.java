package in.sujal;

public class PaymentService {
	private IPayment ip;
	public PaymentService(IPayment ip) {
		this.ip = ip;
	}
	public void doPayment(double billAmt) {
		boolean status = ip.processPaymetn(billAmt);
		if(status) {
			System.out.println("Payment Received.....");
		}else {
			System.out.println("Payment declined.....");
		}
	}

}
