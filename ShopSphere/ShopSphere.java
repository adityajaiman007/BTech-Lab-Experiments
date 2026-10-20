import java.util.Scanner;

public class ShopSphere {
    static Scanner sc = new Scanner(System.in);

    static String[] products = {
        "Laptop", "Headphones", "Smart Watch"
    };

    static int[] prices = {50000, 2000, 3000};
    static int total = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== ShopSphere =====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart Total");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". "
                                + products[i] + " - Rs. "
                                + prices[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter product number (1-3): ");
                    int product = sc.nextInt();

                    if (product >= 1 && product <= products.length) {
                        total += prices[product - 1];
                        System.out.println(products[product - 1]
                                + " added to cart!");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 3:
                    System.out.println("Cart Total: Rs. " + total);
                    break;

                case 4:
                    System.out.println("===== Order Summary =====");
                    System.out.println("Total Amount: Rs. " + total);
                    System.out.println("Thank you for shopping!");
                    break;

                case 5:
                    System.out.println("Exiting ShopSphere...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
