import java.util.Scanner;

public class validExpression {
    public static void main(String[] args) {
        int i, l, t = 0;
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input");
        input = scanner.next();
        l = input.length();

        for (i = 0; i < l; i++) {
            if (input.charAt(i) == '(') {
                t++;
            } else if (input.charAt(i) == ')') {
                t--;
            } else if (input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '+'
                    || input.charAt(i) == '-') {
                if (i > 0 && i < l - 1 && Character.isLowerCase(input.charAt(i - 1))
                        && Character.isLowerCase(input.charAt(i + 1))) {
                    // Valid, do nothing
                } else {
                    break;
                }
            }
        }

        if (i == l && t == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
