public class ItemBuilder {
    private String dish;
    private int price;

    ItemBuilder setDish(String s) {
        this.dish = s;
        return this;
    }

    ItemBuilder setPrice(int n) {
        this.price = n;
        return this;
    }

    Item build() {
        Item item = new Item();
        item.setDish(dish);
        item.setPrice(price);
        return item;
    }
}
