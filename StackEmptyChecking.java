import java.util.Stack;

public class StackEmptyChecking {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Adding 1 and 2 to the stack
        stack.push(1);
        // Remove 1 from the stack
        stack.pop();
        // Call the function
        System.out.println("Is stack empty? " + isStackEmpty(stack));
    }

    public static boolean isStackEmpty(Stack<Integer> stack) {
        // Use the size method
        int stackSize = stack.size();
        return stackSize == 0;
    }
}
