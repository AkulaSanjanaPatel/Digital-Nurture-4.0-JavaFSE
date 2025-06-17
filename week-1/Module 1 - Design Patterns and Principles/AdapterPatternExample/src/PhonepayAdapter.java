public class PhonepayAdapter implements PaymentProcessor {
    private Phonepay phonepay;

    public PhonepayAdapter(Phonepay phonepay) {
        this.phonepay = phonepay;
    }

    public void processPayment(double amount) {
        phonepay.makePhonepayPayment(amount);
    }
}
