import java.util.*;

    public class CommonCharactersInStrings {
        public static List<Character> findCommonCharacters(String str1, String str2) {
            List<Character> commonChars = new ArrayList<>();
            Set<Character> set1 = new HashSet<>();

            // Add characters of the first string to the set
            for (char ch : str1.toCharArray()) {
                set1.add(ch);
            }

            // Check for common characters in the second string
            for (char ch : str2.toCharArray()) {
                if (set1.contains(ch) && !commonChars.contains(ch)) {
                    commonChars.add(ch); // Add only if it's not already added
                }
            }

            return commonChars;
        }

        public static void main(String[] args) {
            String str1 = "hello";
            String str2 = "world";
            List<Character> commonCharacters = findCommonCharacters(str1, str2);
            System.out.println(commonCharacters);
        }
    }


