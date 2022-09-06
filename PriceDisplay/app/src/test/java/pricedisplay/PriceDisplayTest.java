package pricedisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
    @Test public void testGetPriceLabel() {
        PriceDisplay display = new PriceDisplay();
        assertEquals("should print item and price", "The price for item: Kettle is £15.99", display.getPriceLabel("Kettle", 15.99));
    }
}
