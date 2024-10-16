
import java.util.HashSet;
import java.util.Set;

    public class PalindromePermutation {

        public static void main(String[] args) {
            // print the output
            System.out.println(canFormPalindrome("taco cat"));
            System.out.println(canFormPalindrome("racecar"));
            System.out.println(canFormPalindrome("hello"));
        }

        public static boolean canFormPalindrome(String str) {
            Set<Character> uniqueChars = new HashSet<>();

            // using for loops for iterations
            for (char c : str.toLowerCase().toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    if (uniqueChars.contains(c)) {
                        uniqueChars.remove(c);  // Remove if it is an even
                    } else {
                        uniqueChars.add(c);  // Add if it is odd count
                    }
                }
            }


            return uniqueChars.size() <= 1;
        }
    }


