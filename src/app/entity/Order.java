package app.entity;

public class Order {

    private final Product product;
    private final int quantity;
    private final int orderStatus;

    public Order(Product product, int quantity, int orderStatus) {
        this.product = product;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "Order: %d %s".formatted(this.quantity, this.product);
    }
}
