public class UserMaincode {

    public static String agusticValues(String input1) {
        int n = input1.length();
        int result = 0;

        // Generate all possible combinations of '+' signs
        for (int i = 0; i < (1 << (n - 1)); i++) {
            StringBuilder currentExpression = new StringBuilder();
            currentExpression.append(input1.charAt(0));
            
            for (int j = 0; j < n - 1; j++) {
                if ((i >> j & 1) == 1) {
                    currentExpression.append("+");
                }
                currentExpression.append(input1.charAt(j + 1));
            }

            // Use evalExpression method to evaluate the expression
            result += evalExpression(currentExpression.toString());
        }

        return Integer.toString(result);
    }

    // Method to evaluate an expression
    private static int evalExpression(String expression) {
        String[] operands = expression.split("\\+");
        int sum = 0;
        for (String operand : operands) {
            sum += Integer.parseInt(operand);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        String inputStr = "123";
        String outputStr = agusticValues(inputStr);

        // Print the output
        System.out.println("Input: " + inputStr);
        System.out.println("Output: " + outputStr);
    }
}
