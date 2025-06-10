package level01.exercise4;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a TXT file path");
            return;
        }

        TxtFileReader.readFile(args[0]);
    }
}
