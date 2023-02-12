package CreditCard;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardParsing {

    public static String parsingCard(List<String> list) {

    //    System.out.println("Begin");

        String regex = "cardNumber=(\\d+), name=(\\w+), lastName=(\\w+), dateMonth=(\\d+), dateYear=(\\d+), cvv=(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        StringBuilder stingBuilder = new StringBuilder();

        for (String str : list) {
            matcher = pattern.matcher(str);
            if (matcher.find()) {
                stingBuilder.append("cardNumber: ").append(matcher.group(1)).append("\n");
                stingBuilder.append("Name: ").append(matcher.group(2)).append("\n");
                stingBuilder.append("Lastname: ").append(matcher.group(3)).append("\n");
                stingBuilder.append("Month: ").append(matcher.group(4)).append("\n");
                stingBuilder.append("Year: ").append(matcher.group(5)).append("\n");
                stingBuilder.append("CVV: ").append(matcher.group(6)).append("\n\n");

            } else {
                System.out.println("No match found.");
            }
        }
        return stingBuilder.toString();
    }
}