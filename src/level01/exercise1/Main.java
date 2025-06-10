package level01.exercise1;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a directory path");
            return;
        }

        DirectoryLister.listAlphabetically(args[0]);
    }
}
