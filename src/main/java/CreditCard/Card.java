package CreditCard;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Card {
    private String cardNumber;
    private String name;
    private String lastName;
    private String dateMonth;
    private String dateYear;
    private String cvv;

//    LocalDate localDate = LocalDate.now();
//    private final String yearOfExp = String.valueOf(localDate.getYear() + 10);
//    private final String monthOfExp = String.valueOf(localDate.getMonthValue());

}
