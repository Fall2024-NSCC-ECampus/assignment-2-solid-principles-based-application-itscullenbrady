public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order createOrder() {
        return new Order();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
