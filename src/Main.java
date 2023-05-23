import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner itemsScaner = new Scanner(System.in);
        Scanner priceScaner = new Scanner(System.in);

        System.out.println("Enter a number of items");
        Integer itemsQty = itemsScaner.nextInt();
        System.out.println("Quantity of items is:"+itemsQty);
        System.out.println("Enter a price per item");
        Double pricePerItem = priceScaner.nextDouble();
        System.out.println("Price per item is:"+pricePerItem);

        Double rawAmount = itemsQty * pricePerItem;

        System.out.println("Raw amount is:"+rawAmount);
    }
}