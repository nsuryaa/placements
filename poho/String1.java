
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input the letter to find
        System.out.print("Enter the letter to find: ");
        char targetLetter = scanner.next().charAt(0);

        // Call the function to find the occurrence
        int occurrence = countOccurrences(inputString, targetLetter);

        // Display the result
        System.out.println("The letter '" + targetLetter + "' occurs " + occurrence + " times in the given string.");
    }

    // Function to find the occurrence of a letter in a string
    private static int countOccurrences(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
