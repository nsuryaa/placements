import java.util.Scanner;

public class containsZero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (one per line, enter 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            boolean containsZero = containsZero(input);
            System.out.println(containsZero);
        }

        scanner.close();
    }

    private static boolean containsZero(String input) {
        // Check if the string contains '0'
        return input.contains("0");
    }
}
