package level01.exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void listAlphabetically(String path) {
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid directory");
            return;
        }

        String[] items = folder.list();

        if (items != null) {
            Arrays.sort(items);
            for (String item : items) {
                System.out.println(item);
            }
        }
    }
}
