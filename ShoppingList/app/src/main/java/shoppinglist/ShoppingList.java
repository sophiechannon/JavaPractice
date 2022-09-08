package shoppinglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
     List<String> items = new ArrayList<>();

     public void addItem(String item) {
         items.add(item);
     }

     public List<String> getItems() {
        return items;
    }
}
