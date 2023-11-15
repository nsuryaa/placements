public class ReverseStringWithSpaces {
    public static void main(String[] args) {
        String inputString = "Hello World! This is a sample string.";
        String reversedString = reverseStringWithSpaces(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseStringWithSpaces(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        // Reverse the entire string
        reverse(charArray, 0, length - 1);

        int start = 0;

        // Reverse individual words while retaining spaces
        for (int end = 0; end < length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(charArray, start, length - 1);

        return new String(charArray);
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
