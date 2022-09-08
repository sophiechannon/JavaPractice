package shoppinglist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

public class ShoppingListTest {
    @Test public void testListIsEmptyInitially() {
        ShoppingList list = new ShoppingList();
        assertEquals(list.getItems(), Arrays.asList());
    }

    @Test public void testItemsCanBeAddedToList() {
        ShoppingList list = new ShoppingList();
        ShoppingItem itemOne = new ShoppingItem("Coffee", 4.99);
        ShoppingItem itemTwo = new ShoppingItem("Tea", 3.50);
        list.addItem(itemOne);
        list.addItem(itemTwo);
        assertEquals(list.getItems(), Arrays.asList(itemOne, itemTwo));
    }
}
