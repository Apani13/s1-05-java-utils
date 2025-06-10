package level01.exercise3;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java exercise3.Main <directory-path> <output-file>");
            return;
        }

        DirectoryToFileWriter.writeDirectoryTreeToFile(args[0], args[1]);
    }

}
