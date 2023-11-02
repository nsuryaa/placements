public class CharacterOccurence {
    public static void main(String[] args) {
        // Input the string
        String inputString = "occurrence";

        // Call the function to get the character occurrence
        String outputString = getCharacterOccurrence(inputString);

        // Display the result
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + outputString);
    }

    // Function to get the character occurrence in a string
    private static String getCharacterOccurrence(String str) {
        // Assuming ASCII characters, create an array to store counts
        int[] charCount = new int[128];

        // Counting occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount[ch]++;
        }

        // Constructing the output string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                result.append((char) i).append(charCount[i]);
            }
        }

        return result.toString();
    }
}
