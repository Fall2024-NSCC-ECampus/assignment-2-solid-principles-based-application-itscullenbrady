import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    // Getter for products
    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
