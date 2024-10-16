public class PayPalPayment implements PaymentService {
    @Override
    public boolean processPayment(Order order, double amount) {
        // Simulate PayPal payment processing
        if (amount == order.calculateTotal()) {
            System.out.println("Payment of $" + amount + " processed via PayPal.");
            return true;
        } else {
            System.out.println("Payment failed via PayPal.");
            return false;
        }
    }
}
