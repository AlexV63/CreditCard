package CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardParsing {

    public static void parsingCard(List<String> list) {
        String regex = "cardNumber=(\\d+), name=(\\w+), lastName=(\\w+), dateMonth=(\\d+), dateYear=(\\d+), cvv=(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        String cardNumber = "";
        String name = "";
        String lastName = "";
        String month = "";
        String year = "";
        String cvv = "";

        for (String str : list) {
            matcher = pattern.matcher(str);
            if (matcher.find()) {
                System.out.println("cardNumber: " + matcher.group(1));
                System.out.println("Name: " + matcher.group(2));
                System.out.println("Lastname: " + matcher.group(3));
                System.out.println("Month: " + matcher.group(4));
                System.out.println("Year: " + matcher.group(5));
                System.out.println("CVV: " + matcher.group(6));
            } else {
                System.out.println("No match found.");
            }
            System.out.println(str);
        }
    }
}