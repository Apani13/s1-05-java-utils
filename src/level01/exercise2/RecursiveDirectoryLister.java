package level01.exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RecursiveDirectoryLister {

    public static void listDirectoryTree(String path, String indent) {
        File folder = new File(path);

        if (!folder.exists()) {
            System.out.println("The path does not exist: " + path);
            return;
        }

        if (!folder.isDirectory()) {
            System.out.println("The path is not a directory: " + path);
        }

        File[] files = folder.listFiles();

        if (files != null) {
            Arrays.sort(files, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
                System.out.println(indent + type + " - " + file.getName() + " - " + lastModified);

                if (file.isDirectory()) {
                    listDirectoryTree(file.getAbsolutePath(), indent + "    ");
                }
            }

        }
    }

}
