package level01.exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryToFileWriter {

    public static void writeDirectoryTreeToFile(String path, String outputFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writeTree(new File(path), "", writer);
            System.out.println("Directory tree saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }

    private static void writeTree(File folder, String indent, PrintWriter writer) {
        if (!folder.exists() || !folder.isDirectory()) {
            writer.println("Invalid directory");
            return;
        }

        File[] files = folder.listFiles();

        if (files != null) {
            Arrays.sort(files, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
                writer.println(indent + type + " - " + file.getName() + " - " + lastModified);

                if (file.isDirectory()) {
                    writeTree(file, indent + " ", writer);
                }
            }
        }
    }

}
