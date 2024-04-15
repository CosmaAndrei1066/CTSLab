package example2;

public class main {

	public static void main(String[] args) {
		
		PaymentProcessor payPalAdapter = new PayPalAdapter(new PayPal());
		PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
		
		payPalAdapter.processPayment(222);
		stripeAdapter.processPayment(222);
	}

}
