import java.util.Stack;

public class PalindromeChecking {
    public static void main(String[] args) {

        String input = "racecar";

        // Call the function
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Pushing
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversedString = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            reversedString += (stack.pop());
        }


        return str.equals(reversedString.toString());
    }
}
