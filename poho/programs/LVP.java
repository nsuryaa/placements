import java.util.Stack;

public class LVP {
    public int longestValidParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LVP solution = new LVP();

        // Test cases
        String s1 = "(()";
        System.out.println("Longest valid parentheses in s1: " + solution.longestValidParentheses(s1));

        String s2 = ")()())";
        System.out.println("Longest valid parentheses in s2: " + solution.longestValidParentheses(s2));

        String s3 = "";
        System.out.println("Longest valid parentheses in s3: " + solution.longestValidParentheses(s3));
    }
}
