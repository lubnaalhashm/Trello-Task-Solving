import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        // Call the reverse method and print the result
        System.out.println("The Reversed is: " + reverseString(input));

        scanner.close();
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        // Pop
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
