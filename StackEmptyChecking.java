import java.util.Stack;

public class StackEmptyChecking {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Adding 1 to the stack
        stack.push(2);
        // Remove 1 from the stack
        stack.pop();
        // Here Calling the function
        System.out.println("Is the stack empty? " + isStackEmpty(stack));
    }

    public static boolean isStackEmpty(Stack<Integer> stack) {

        return stack.isEmpty();
    }
}
