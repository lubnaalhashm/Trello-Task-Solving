import java.util.Scanner;
import java.util.Stack;

public class CheckDuplicateParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the parentheses: ");
        String input = scanner.nextLine();

        boolean result = hasDuplicateParentheses(input);
        System.out.println("With duplicate parentheses: " + result);

        scanner.close();
    }

    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                // Check the duplicate parentheses
                if (stack.isEmpty() || stack.peek() == '(') {
                    return true; // Duplicate parentheses found
                }

                // Pop elements
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }

                // Pop the '('
                if (!stack.isEmpty()) {
                    stack.pop(); // Remove
                }
            } else {
                stack.push(ch);
            }
        }

        return false; // No duplicate parentheses
    }
}
