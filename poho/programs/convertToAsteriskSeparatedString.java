public class convertToAsteriskSeparatedString {
    public static void main(String[] args) {
        String input = "surya is a good boy ";
        String output = convertToAsteriskSeparatedString(input);
        System.out.println(output);
    }

    private static String convertToAsteriskSeparatedString(String input) {
        // Trim any leading or trailing spaces
        input = input.replaceAll(" ", "*").toLowerCase();

        // Join the words using the '*' delimiter
        return input;
    }
}
