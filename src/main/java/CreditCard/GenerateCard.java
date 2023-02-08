package CreditCard;

import java.time.LocalDate;
import java.util.Random;

import com.github.javafaker.Faker;


public class GenerateCard {
    static Random random = new Random();
    static Faker faker = new Faker();

    public String generateAccount(TypeCard typeCard) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (typeCard) {
            case AMEX:
                stringBuilder.append(3);
                stringBuilder.append(random.nextBoolean() ? 4 : 7);
                for (int i = 0; i < 13; i++) {
                    stringBuilder.append(random.nextInt(10));
                }
                break;
            case VISA:
                stringBuilder.append(4);
                for (int i = 0; i < 15; i++) {
                    stringBuilder.append(random.nextInt(10));
                }
                break;
            case MASTERCARD:
                stringBuilder.append(5);
                stringBuilder.append(random.nextInt(1,6));
                for (int i = 0; i < 14; i++) {
                    stringBuilder.append(random.nextInt(10));
                }
                break;
        }
       return stringBuilder.toString();
    }

    public String generateName() {
        return faker.name().firstName();
    }

    public String generateLastName() {
        return faker.name().lastName();
    }

    public String generateMonth() {
        int monthTmp = random.nextInt(1, 13);
        String month = String.valueOf(monthTmp).length() > 1 ? String.valueOf(monthTmp) : "0" + String.valueOf(monthTmp);
        return month;
    }

    public String generateYear() {
        LocalDate localDate = LocalDate.now();
        int yearTmp = random.nextInt(localDate.getYear() + 1, localDate.getYear() + 6);
        String year = String.valueOf(yearTmp);
        return year;
    }


    public String generateCVV() {
        String cvv = "";
        for (int i = 0; i < 3; i++) {
            int n = random.nextInt(0, 10);
            cvv = cvv + n;
        }
        return cvv;
    }


}


