package CreditCard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    static List<String> readFile(String path) {
        List<String> readers = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                readers.add(temp);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return readers;
    }


}




