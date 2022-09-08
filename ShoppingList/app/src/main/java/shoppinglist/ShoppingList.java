package shoppinglist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
     List<ShoppingItem> items = new ArrayList<>();

     public void addItem(ShoppingItem item) {
         items.add(item);
     }

     public List<ShoppingItem> getItems() {
        return items;
    }
}
