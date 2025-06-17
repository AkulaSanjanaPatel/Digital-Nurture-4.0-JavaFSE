public class Test {
    public static void main(String[] args) {
        // Create a PayPal payment strategy
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        PaymentContext context = new PaymentContext(paypal);
        context.executePayment(100.0);

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        context = new PaymentContext(creditCard);
        context.executePayment(200.0);
    }
}