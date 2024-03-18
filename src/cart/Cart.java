package cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<String> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void clearCart() {
        items.clear();
    }
}
