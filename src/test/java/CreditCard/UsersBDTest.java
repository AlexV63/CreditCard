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
        List<String> users = new ArrayList<>();
        users.add(String.valueOf(user1));
        users.add(String.valueOf(user2));
        users.add(String.valueOf(user3));

        users.add(String.valueOf(user4));
        Assertions.assertEquals(4, users.size(), "No card added");


    }
}