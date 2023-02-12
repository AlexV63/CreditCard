package CreditCard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static CreditCard.ReadFile.readFile;


class ReadFileTest {
    /**
     * Надо проверить как читается файл, в котором записаны строки
     * ??? надо ли проверять пустой файл ??? по идее он его прочитает как пустой
     *
     *
     *
     *
     * In the test, we create a temporary file using the Files.createTempFile method
     * and write the expected contents to it.
     * Then we pass the file path to the readFile method
     * and store the result in the actualResult variable.
     * Finally, we use the assertArrayEquals method to compare
     * the expected and actual results, which are stored as arrays.
     * If they match, the test passes.
     * The temporary file is deleted after the test is complete.
     */
    @Test
    public void testReadFile() throws IOException {
        Path tempFile = Files.createTempFile("temp", ".txt");
        List<String> expectedResult = Arrays.asList("line 1", "line 2", "line 3");
        Files.write(tempFile, expectedResult);

        List<String> actualResult = readFile(tempFile.toString());

        Assertions.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
        Files.delete(tempFile);
    }

    @Test
    public void testReadFileIsEmpty() throws IOException {
        Path tempFile = Files.createTempFile("temp", ".txt");
        List<String> expectedResult = Arrays.asList("");
        Files.write(tempFile, expectedResult);

        List<String> actualResult = readFile(tempFile.toString());

        Assertions.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
        Files.delete(tempFile);
    }
}