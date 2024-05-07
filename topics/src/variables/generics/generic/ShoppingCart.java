package variables.generics.generic;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T extends Item> {
    private List<T> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println("Name: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }
}