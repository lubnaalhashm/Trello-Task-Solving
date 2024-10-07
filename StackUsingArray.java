import java.util.ArrayList;

public class StackUsingArray {
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) {
        push(20);
        push(30);
        push(40);
        push(50);
        printStack();
        pop();
        printStack();
        checkIfEmpty();
        peek();
    }

    public static void printStack() {
        System.out.println("Current stack: " + stack);
    }

    public static void push(Integer element) {
        stack.add(element);
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            Integer removedElement = stack.remove(stack.size() - 1);
            System.out.println("Removing element: " + removedElement);
        } else {
            System.out.println(" Cannot pop.");
        }
    }

    public static void checkIfEmpty() {
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }

    public static void peek() {
        if (!stack.isEmpty()) {
            System.out.println("Element at the top: " + stack.get(stack.size() - 1));
        } else {
            System.out.println(" No top element.");
        }
    }
}
