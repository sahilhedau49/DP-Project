class DiscountedCartDecorator implements Cart {
    private Cart cart;

    DiscountedCartDecorator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addToCart(Item item) {
        cart.addToCart(item);
    }

    @Override
    public void displayCart() {
        System.out.println("\nCart Summary:");
        double total = cart.calculateTotal();
        if (total > 100) {
            System.out.println("Discount Applied!");
        }
        cart.displayCart();
        double totalAmount = this.calculateTotal();
        System.out.println("Total (After discount): " + totalAmount);
        System.out.println("*****************************\n");
    }

    @Override
    public double calculateTotal() {
        double total = cart.calculateTotal();
        if (total > 100) {
            return total * 0.95;
        } else if (total > 200) {
            return total * 0.9;
        }
        return total;
    }
}
