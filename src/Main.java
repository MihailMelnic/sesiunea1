// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String productName = "mustar";
        double price = 2.77;
        boolean isAvailable = true;
        char nutriScore = 'A';
        boolean isBio = false;

        String productName2 = "mustar2";
        double price2 = 65;
        boolean isAvailable2 = false;
        char nutriScore2 = 'A';
        boolean isBio2  = true;

        double totalPrice = price + price2;
        double mediumPrice = totalPrice/2;
        System.out.println(totalPrice);
        System.out.println(mediumPrice);
    }
}

