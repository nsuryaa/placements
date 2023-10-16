package codingquestions;
public class GoodnessAndScore{
    public static void main(String[] args) {
        String input = "abc123";
        int[] result = calculateGoodnessAndScore(input);
        
        if (result[0] > result[1]) {
            System.out.println("The string is good.");
        } else {
            System.out.println("The string is not good.");
        }

        System.out.println("Score: " + result[2]);
    }

    public static int[] calculateGoodnessAndScore(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        int score = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else if (Character.isDigit(c)) {
                score += Character.getNumericValue(c);
            }
        }

        return new int[]{vowelsCount, consonantsCount, score};
    }

    public static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
