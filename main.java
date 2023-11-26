import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Making Menu
        ArrayList<Item> menu = new ArrayList<Item>();
        initMenu(menu);

        // User will be prompted to choose items from menu
        Cart cart = createCart();
        addToCart(cart, menu);
        cart.displayCart();

        // Payment Strategy
        processPayment();
    }

    public static void initMenu(ArrayList<Item> menu) {
        ItemBuilder mainib = new ItemBuilder();
        menu.add(mainib.setDish("Burger").setPrice(100).build());
        menu.add(mainib.setDish("Pizza").setPrice(200).build());
        menu.add(mainib.setDish("Coffee").setPrice(60).build());
    }

    private static Cart createCart() {
        Cart cart = new BasicCart();
        return new DiscountedCartDecorator(cart);
    }

    public static void addToCart(Cart cart, ArrayList<Item> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).dish);
        }

        int choice;
        do {
            System.out.print("Enter the number of the food item you want to order (0 to finish): ");
            choice = scanner.nextInt();

            if (choice > 0 && choice <= menu.size()) {
                cart.addToCart(menu.get(choice - 1));
                System.out.println(menu.get(choice - 1).dish + " added to your cart.");
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    private static void processPayment() {
        System.out.println("Payment Options:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");

        System.out.print("Choose a payment method (1-3): ");
        int paymentChoice = scanner.nextInt();
        PaymentStrategy paymentStrategy;

        switch (paymentChoice) {
            case 1:
                paymentStrategy = new CreditCardPayment();
                break;
            case 2:
                paymentStrategy = new PayPalPayment();
                break;
            case 3:
                paymentStrategy = new CashPayment();
                break;
            default:
                System.out.println("Invalid payment choice. Payment failed.");
                return;
        }

        System.out.println("Processing payment...");
        paymentStrategy.processPayment();
        System.out.println("Thank you for using the Food Ordering App!");
    }
}