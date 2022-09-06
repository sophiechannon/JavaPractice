package pricedisplay;

public class PriceDisplay {
    public static void main(String[] args) {
    }
    public String getPriceLabel(String item, Double price) {
        String formattedString = String.format("The price for item: %s is £%.2f", item, price);
        return formattedString;
    }
}
