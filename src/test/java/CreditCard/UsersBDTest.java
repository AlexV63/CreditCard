package CreditCard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersBDTest {
    /**
     * добавить карту  - ожидаемо увеличение листа
     * пустую карту- нет изменения листа
     */
    GenerateCard generateCard = new GenerateCard();
    Card user1 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
            generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
    Card user2 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
            generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
    Card user3 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
            generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());
    Card user4 = new Card(generateCard.generateAccount(TypeCard.VISA), generateCard.generateName(), generateCard.generateLastName(),
            generateCard.generateMonth(), generateCard.generateYear(), generateCard.generateCVV());

    @Test
    void addCard() {
        UsersBD usersBD = new UsersBD();

        usersBD.addCard(user1);
        usersBD.addCard(user2);
        usersBD.addCard(user3);
        usersBD.addCard(user4);

        Assertions.assertEquals(4, usersBD.getUsers().size(), "No card added");
    }

//    void addCardON() {
//        List<String> users = new ArrayList<>();
//        users.add(String.valueOf(user1));
//        users.add(String.valueOf(user2));
//        users.add(String.valueOf(user3));
//
//        users.add(String.valueOf(user4));
//        Assertions.assertTrue(3,users. "//No card added");
//    }
}