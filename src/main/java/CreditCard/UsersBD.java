package CreditCard;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class UsersBD {

    private List<String> users = new ArrayList<>();

    public void addCard(Card card) {
        if (card != null) {
            users.add(card.toString());
        }
    }
}