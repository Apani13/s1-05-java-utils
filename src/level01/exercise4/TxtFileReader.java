package level01.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader {

    public static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }
    }
}
