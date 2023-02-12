package CreditCard;

import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GenerateCard generateCard = new GenerateCard();
        Card user1 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
                generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
        Card user2 = new Card(generateCard.generateAccount(TypeCard.MASTERCARD), generateCard.generateName(), generateCard.generateLastName(),
                generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
        Card user3 = new Card(generateCard.generateAccount(TypeCard.AMEX), generateCard.generateName(), generateCard.generateLastName(),
                generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
        Card user4 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
                generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());

        System.out.println(user1);
        UsersBD usersBD = new UsersBD();
        usersBD.addCard(user1);
        usersBD.addCard(user2);
        usersBD.addCard(user3);
        usersBD.addCard(user4);

 //       System.out.println(usersBD.getUsers());


        WriteFile.writeFile(usersBD.getUsers());
        String path = "cards.txt";
        System.out.println(ReadFile.readFile(path));

        System.out.println(CardParsing.parsingCard(ReadFile.readFile(path)));

    }
}
