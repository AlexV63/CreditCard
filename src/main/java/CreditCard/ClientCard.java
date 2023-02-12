package CreditCard;

import lombok.ToString;

@ToString
public class ClientCard {

    private static String dataClient;

    static String getClientAsString(Card card) {
        dataClient = "C:"+card.getCardNumber() + " N:" + card.getName() + " LN:" + card.getLastName() +
                " DATA:" + card.getDateMonth()+"/"+ card.getDateYear() + " Cvv:" + card.getCvv() + " ;";
        return dataClient;
    }
}
