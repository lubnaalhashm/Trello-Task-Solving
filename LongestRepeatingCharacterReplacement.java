import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        // Print the result
        System.out.println(findLongestSubstring(s, k));
    }

    public static int findLongestSubstring(String s, int k) {
        int maxLength = 0;
        int start = 0;
        int maxRepeated = 0;

        Set<Character> charSet = new HashSet<>();
        Set<Character> counted = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            charSet.add(character); // Adding character to the set

            // Here count the frequency
            int freq = 0;
            for (char c : charSet) {
                if (c == character) {
                    freq++;
                }
            }
            maxRepeated = Math.max(maxRepeated, freq);


            if (i - start + 1 - maxRepeated > k) {
                charSet.remove(s.charAt(start)); // Removing the character
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
