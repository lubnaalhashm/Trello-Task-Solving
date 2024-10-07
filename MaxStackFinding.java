import java.util.Stack;

public class MaxStackFinding {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        pushElement(3);
        pushElement(6);
        pushElement(4);
        printMaximum();
    }

    public static void pushElement(int element) {
        stack.push(element);  // Using push
    }

    public static void printMaximum() {
        if (!stack.isEmpty()) {
            int maxElement = stack.get(0);  // Initialize with the first element
            for (int i = 1; i < stack.size(); i++) {
                if (stack.get(i) > maxElement) {
                    maxElement = stack.get(i);
                }
            }
            System.out.println("The maximum element is: " + maxElement);
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
