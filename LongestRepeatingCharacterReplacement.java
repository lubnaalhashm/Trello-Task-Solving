import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(findMaxRepeatingSubstring(s, k)); // Output: 4
    }

    public static int findMaxRepeatingSubstring(String c, int k) {
        // Declaration and initialization
        int maxLength = 0;
        int left = 0;
        int maxCount = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < c.length(); right++) {
            charSet.add(c.charAt(right)); // Adding char to set

            int windowLength = right - left + 1; // window length
            maxCount = Math.max(maxCount, countMaxFrequency(c, left, right)); // Updating the max frequency

            if (windowLength - maxCount > k) {
                charSet.remove(c.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1); // Update max length
        }
        return maxLength;
    }

    static int countMaxFrequency(String s, int left, int right) {
        int[] count = new int[s.length()];
        int maxFrequency = 0;

        for (int i = left; i <= right; i++) {
            count[s.charAt(i) - 'A']++; // Count chars
            maxFrequency = Math.max(maxFrequency, count[s.charAt(i) - 'A']);
        }
        return maxFrequency; //return the result
    }
}
