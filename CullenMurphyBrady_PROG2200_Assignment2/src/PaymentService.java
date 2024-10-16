public interface PaymentService {
    boolean processPayment(Order order, double amount);
}
