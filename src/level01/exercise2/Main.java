package level01.exercise2;

public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide a directory path");
            return;
        }

        RecursiveDirectoryLister.listDirectoryTree(args[0],"" );
    }
}
