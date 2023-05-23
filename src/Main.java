import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner itemsScaner = new Scanner(System.in);
        Scanner priceScaner = new Scanner(System.in);
        Scanner twoLetterStateCode = new Scanner(System.in);

        System.out.println("Enter a number of items");
        Integer itemsQty = itemsScaner.nextInt();
        System.out.println("Quantity of items is:"+itemsQty);

        System.out.println("Enter a price per item");
        Double pricePerItem = priceScaner.nextDouble();
        System.out.println("Price per item is:"+pricePerItem);

        Double rawAmount = itemsQty * pricePerItem;
        System.out.println("Raw amount is:"+rawAmount);

        System.out.println("Enter a 2-letters State Code");
        String stateCode = twoLetterStateCode.nextLine();
        System.out.println("State code is:"+stateCode);

        Double taxRate;
        Map<String, Double> taxes = new HashMap<>();
        taxes.put("UT", 0.0685);
        taxes.put("NV", 0.08);
        taxes.put("TX", 0.0625);
        taxes.put("AL", 0.04);
        taxes.put("CA", 0.0825);

            switch (stateCode){
                case "UT":
                    taxRate=taxes.get("UT");
                    break;
                case "NV":
                    taxRate=taxes.get("NV");
                    break;
                case "TX":
                    taxRate=taxes.get("TX");
                    break;
                case "AL":
                    taxRate=taxes.get("AL");
                    break;
                case "CA":
                    taxRate=taxes.get("CA");
                    break;
                default:
                    taxRate = 0.00;
            }
        Double amountTaxed = rawAmount+(rawAmount*taxRate);
        System.out.printf("Tax rate is: %.2f", taxRate*100);
        System.out.println("% Total amount is: "+amountTaxed);
    }
}