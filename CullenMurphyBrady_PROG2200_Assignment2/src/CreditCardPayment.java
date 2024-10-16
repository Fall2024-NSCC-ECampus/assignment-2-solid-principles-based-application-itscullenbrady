public class CreditCardPayment implements PaymentService {
    @Override
    public boolean processPayment(Order order, double amount) {
        // Simulate credit card payment processing
        if (amount == order.calculateTotal()) {
            System.out.println("Payment of $" + amount + " processed via Credit Card.");
            return true;
        } else {
            System.out.println("Payment failed via Credit Card.");
            return false;
        }
    }
}
