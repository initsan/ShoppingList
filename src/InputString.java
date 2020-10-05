import java.util.Scanner;

public class InputString {
    private static Scanner scanner = new Scanner(System.in);

    private InputString() {
    }

    public static String inputData() {
        return scanner.nextLine();
    }
}
