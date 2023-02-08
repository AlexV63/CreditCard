package CreditCard;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WriteFile {

    protected static void writeFile(List<String> list) {
        try (FileWriter writer = new FileWriter("cards.txt")) {
            for (String user : list) {
                writer.write(user+ "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

