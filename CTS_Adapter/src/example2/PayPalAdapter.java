package example2;

public class PayPalAdapter implements PaymentProcessor{
	private PayPal paypal;
	
	public PayPalAdapter(PayPal paypal) {
		this.paypal=paypal;
	}
	
	@Override
	public void processPayment(double number) {
		paypal.sendPayment();
	}
	
}
