public class Order {
    private Customer customer;
    private Cart cart;

    public Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
    }

    public void displayOrderSummary() {
        System.out.println("\n===== Order Summary =====");
        customer.displayCustomer();
        cart.displayCart();
        System.out.println("Order placed successfully!");
    }
}
