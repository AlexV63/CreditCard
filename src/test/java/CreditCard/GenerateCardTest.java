package CreditCard;

import org.junit.jupiter.api.Assertions;
import org.mockito.internal.matchers.Null;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static CreditCard.TypeCard.*;
import static org.junit.jupiter.api.Assertions.*;

class GenerateCardTest {

    // VISA , AMEX , MASTERCARD, NULL
    // 4 + 15(16 digits)
    // 3 + 14 /15 digits; second 4 or 7
    // 51-55 + 14 / digits 16
    // by null - input error

    @org.junit.jupiter.api.Test
    void generateAccountAMEX() {
        GenerateCard generateCard = new GenerateCard();
        int count = 0;
        for (int i = 0; i < 15; i++) {
            String card = generateCard.generateAccount(TypeCard.AMEX);
            char[] tmp = card.toCharArray();
            if (tmp[0] != '3') {
                count++;
            }
            if (tmp[1] != '4' && tmp[1] != '7') {
                count++;
            }
        }
        Assertions.assertTrue(count == 0);
    }

    @org.junit.jupiter.api.Test
    void generateAccountLengthAMEX() {
        GenerateCard generateCard = new GenerateCard();
        String card = generateCard.generateAccount(TypeCard.AMEX);
        Assertions.assertTrue(card.length() == 15);
    }

    @org.junit.jupiter.api.Test
    void generateAccountVISA() {
        GenerateCard generateCard = new GenerateCard();
        int count = 0;
        for (int i = 0; i < 15; i++) {
            String card = generateCard.generateAccount(TypeCard.VISA);
            char[] tmp = card.toCharArray();
            if (tmp[0] != '4') count++;
        }
        Assertions.assertTrue(count == 0);
    }

    @org.junit.jupiter.api.Test
    void generateAccountLengthVISA() {
        GenerateCard generateCard = new GenerateCard();
        String card = generateCard.generateAccount(VISA);
        Assertions.assertTrue(card.length() == 16);
    }

    @org.junit.jupiter.api.Test
    void generateAccountMC() {
        GenerateCard generateCard = new GenerateCard();
        int count = 0;
        for (int i = 0; i < 15; i++) {
            String card = generateCard.generateAccount(MASTERCARD);
            char[] tmp = card.toCharArray();
            if (tmp[0] != '5') {
                count++;
            }
            if (tmp[1] < 1 && tmp[1] > 5) {
                count++;
            }
        }
        Assertions.assertTrue(count == 0);
    }

    @org.junit.jupiter.api.Test
    void generateAccountLengthMC() {
        GenerateCard generateCard = new GenerateCard();
        String card = generateCard.generateAccount(MASTERCARD);
        Assertions.assertTrue(card.length() == 16);
    }

    @org.junit.jupiter.api.Test
    void generateName() {
        GenerateCard generateCard = new GenerateCard();
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z-']+$");
        String card = generateCard.generateName();
        Matcher matcher = pattern.matcher(card);
        if (matcher.find())
            Assertions.assertEquals(matcher.group(), card, "Check name");
    }


    @org.junit.jupiter.api.Test
    void generateLastName() {
        GenerateCard generateCard = new GenerateCard();
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z-']+$");
        String card = generateCard.generateLastName();
        Matcher matcher = pattern.matcher(card);
        if (matcher.find())
            Assertions.assertEquals(matcher.group(), card, "Check Lastname");
    }

    @org.junit.jupiter.api.Test
    void generateMonthLength() {
        GenerateCard generateCard = new GenerateCard();
        String card = generateCard.generateMonth();
        Assertions.assertTrue(card.length() == 2);
    }

    @org.junit.jupiter.api.Test
    void generateMonth() {
        String card = new GenerateCard().generateYear();
        Pattern pattern = Pattern.compile("^\\d\\d$");
        Matcher matcher = pattern.matcher(card);
        if (matcher.find())
            Assertions.assertEquals(matcher.group(), card, "Check Month");
    }

    @org.junit.jupiter.api.Test
    void generateYearLength() {
        GenerateCard generateCard = new GenerateCard();
        String card = generateCard.generateYear();
        Assertions.assertTrue(card.length() == 4);
    }

    @org.junit.jupiter.api.Test
    void generateYear() {
        String card = new GenerateCard().generateYear();
        Pattern pattern = Pattern.compile("^\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(card);
        if (matcher.find())
            Assertions.assertEquals(matcher.group(), card, "Check Year");
    }

    @org.junit.jupiter.api.Test
    void generateCVV() {
        String card = new GenerateCard().generateCVV();
        Pattern pattern = Pattern.compile("^\\d\\d\\d$");
        Matcher matcher = pattern.matcher(card);
        if (matcher.find())
            Assertions.assertEquals(matcher.group(), card, "Check CVV");
    }

    @org.junit.jupiter.api.Test
    void generateCVVLength() {
        String card = new GenerateCard().generateCVV();
        Assertions.assertTrue(card.length() == 3);
    }
}