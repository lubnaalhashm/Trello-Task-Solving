public class LongestMirrorImage {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abca")); // Output: "a"
    }

    public static String mirrorEnds(String str) {
        int maxLength = str.length();
        String result = "";


        for (int i = 0; i < maxLength; i++) {
            // Check if characters match
            if (str.charAt(i) == str.charAt(maxLength - 1 - i)) {
                result += str.charAt(i); // Concatenate matching character to result
            } else {
                break; // Stop if characters don't match
            }
        }

        return result; // Return the result
    }
}
