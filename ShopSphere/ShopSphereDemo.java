public class ShopSphereDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 50000);
        Product headphones = new Product("Headphones", 2000);

        Customer customer = new Customer(
            "Rahul", "rahul@example.com"
        );

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(headphones);

        Order order = new Order(customer, cart);
        order.displayOrderSummary();
    }
}
