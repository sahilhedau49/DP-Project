# DP-Project

# Food Ordering Console Application

This console-based Java application allows users to order food items, add them to a cart, and make payments. The design of the application incorporates three design patterns: Builder, Decorator, and Strategy.

## Project Structure

- **main.java**: The main class containing the application's entry point. It initializes the menu, creates a cart, adds items to the cart, displays the cart, and processes payments.

- **Item.java**: Represents a food item with properties like dish name and price.

- **ItemBuilder.java**: Implements the Builder design pattern for constructing Item objects.

- **Cart.java**: Defines the Cart interface with methods for adding items, displaying the cart, and calculating the total.

- **BasicCart.java**: Implements the Cart interface as a basic shopping cart.

- **DiscountedCartDecorator.java**: Implements the Decorator design pattern to add discounts to the cart dynamically.

- **PaymentStrategy.java**: Defines the PaymentStrategy interface for payment processing.

- **CashPayment.java, CreditCardPayment.java, PayPalPayment.java**: Implement the PaymentStrategy interface for different payment methods.

## Usage

1. Run the `main.java` file.
2. Choose food items from the menu and add them to your cart.
3. View the cart summary with or without discounts.
4. Choose a payment method (Credit Card, PayPal, or Cash) to complete the order.

## Design Patterns Used

1. **Builder Design Pattern**: Implemented through the `ItemBuilder` class to construct `Item` objects with various properties.

2. **Decorator Design Pattern**: Implemented through the `DiscountedCartDecorator` class to add discounts to the cart dynamically.

3. **Strategy Design Pattern**: Implemented through the `PaymentStrategy` interface and its concrete implementations (`CashPayment`, `CreditCardPayment`, `PayPalPayment`) to allow flexibility in payment methods.

## How to Contribute

1. Fork the repository.
2. Create a branch: `git checkout -b feature/your-feature-name`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/your-feature-name`.
5. Submit a pull request.

Feel free to contribute and enhance the functionality of the application!
