import java.util.Stack;

public class TheMaxStack {
    static Stack<Integer> stack = new Stack<>();
    static int currentMax = Integer.MIN_VALUE;

    public static void main(String[] args) {
        push(2);
        push(1);
        push(5);
        push(4);
        System.out.println("Maximum in the stack: " + findMaximum());
    }

    public static void push(int number) {
        if (number > currentMax) {
            currentMax = number;
        }
        // Pushing
        stack.push(number);
    }

    public static Integer findMaximum() {
        // Return the current maximum
        return stack.isEmpty() ? null : currentMax;
    }
}
