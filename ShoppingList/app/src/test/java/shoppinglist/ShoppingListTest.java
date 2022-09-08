package shoppinglist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

public class ShoppingListTest {
    @Test public void testListIsEmptyInitially() {
        ShoppingList list = new ShoppingList();
        assertEquals(list.getItems(), Arrays.asList());
    }
}
