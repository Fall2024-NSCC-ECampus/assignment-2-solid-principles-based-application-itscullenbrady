public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(1, "Laptop", 1500.99);
        Product product2 = new Product(2, "Smartphone", 1000.99);

        // Create a user and an order
        User user = new User(1, "Cullen");
        Order order = user.createOrder();

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);

        // Calculate total price
        double total = order.calculateTotal();
        System.out.println("Total price: $" + total);

        // Process payment via PayPal
        PaymentService payment = new PayPalPayment();
        payment.processPayment(order, total);

        // Schedule delivery
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.scheduleDelivery(order);
        System.out.println(deliveryService.trackingInfo(order.hashCode()));
    }
}
