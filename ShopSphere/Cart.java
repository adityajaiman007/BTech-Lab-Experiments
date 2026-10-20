import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void displayCart() {
        int total = 0;

        System.out.println("\n===== Shopping Cart =====");

        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        for (Product product : items) {
            product.displayProduct();
            total += product.getPrice();
        }

        System.out.println("Total: Rs. " + total);
    }

    public int getTotal() {
        int total = 0;

        for (Product product : items) {
            total += product.getPrice();
        }

        return total;
    }
}
