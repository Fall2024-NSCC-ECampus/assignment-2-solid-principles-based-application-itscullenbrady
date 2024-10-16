public class DeliveryService {
    public void scheduleDelivery(Order order) {
        System.out.println("Delivery scheduled for Order with " + order.getProducts().size() + " items.");
    }

    public String trackingInfo(int orderId) {
        // Simulate tracking info retrieval
        return "Tracking info for Order ID: " + orderId;
    }
}
