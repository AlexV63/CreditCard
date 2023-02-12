package CreditCard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static CreditCard.ClientCard.getClientAsString;

class ClientCardTest {

    /**
     * Надо здесь протестировать как при парсинге карты
     * -на соответствие полученной стринги ожидаемой
     * -на получение не валидной карты  !! я думаю что не нужен такой тест
     * -на пустую карту !! я думаю что не нужен такой тест
     */
    @Test
    public void testGetClientAsString() {
        Card card = new Card("1234 5678 9101 1121", "John", "Doe", "02", "2025", "123");
        String expectedResult = "C:1234 5678 9101 1121 N:John LN:Doe DATA:02/2025 Cvv:123 ;";
        String actualResult = getClientAsString(card);

        Assertions.assertEquals(expectedResult, actualResult);
    }

   /**
         *  In the test, we create a Card object with the given parameters,
         *  and then pass it as an argument to the getClientAsString method.
         *  The expected result is stored in the expectedResult variable
         *  and the actual result is stored in the actualResult variable.
         *  Finally, we use the assertEquals method to compare the expected
         *  and actual results. If they match, the test passes.
         */

    }


