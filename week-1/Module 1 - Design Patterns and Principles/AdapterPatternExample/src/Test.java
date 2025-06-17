public class Test {
    public static void main(String[] args) {
        PaymentProcessor phonepay = new PhonepayAdapter(new Phonepay());
        PaymentProcessor paypal = new PaypalAdapter(new PaypalGateway());
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        RazorpayAdapter razorpay = new RazorpayAdapter(new RazorpayGateway());

        System.out.println("Testing different payment processors:");
        phonepay.processPayment(1000);
        paypal.processPayment(2000);
        stripe.processPayment(30000);
        razorpay.processPayment(4000);
    }
}
