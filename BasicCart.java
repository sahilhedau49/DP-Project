import java.util.ArrayList;

class BasicCart implements Cart {
    private ArrayList<Item> items;

    BasicCart() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addToCart(Item item) {
        items.add(item);
    }

    @Override
    public void displayCart() {
        System.out.println("\n*********** Cart ************");
        for (Item m : items) {
            System.out.println("Dish: " + m.dish + "\tPrice: " + m.price);
        }
        System.out.println("----------------------------");
        System.out.println("Total: \t\t" + calculateTotal());
        System.out.println("----------------------------");
    }

    @Override
    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
}