public class reverseString {
    public static String reverseStringWithPunctuation(String inputStr) {
        // Convert the string to a char array
        char[] charArray = inputStr.toCharArray();

        // Initialize pointers for the start and end of the string
        int start = 0, end = charArray.length - 1;

        // Iterate until the pointers meet
        while (start < end) {
            // Skip punctuations and spaces from the start
            while (start < end && !Character.isLetterOrDigit(charArray[start])) {
                start++;
            }

            // Skip punctuations and spaces from the end
            while (start < end && !Character.isLetterOrDigit(charArray[end])) {
                end--;
            }

            // Swap characters at the start and end pointers
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move pointers towards each other
            start++;
            end--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Test the function
        String sampleInput = "house no : 123@ cbe";
        String output = reverseStringWithPunctuation(sampleInput);
        System.out.println(output);
    }
}
