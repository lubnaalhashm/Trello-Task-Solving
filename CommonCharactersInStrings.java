import java.util.*;

    public class CommonCharactersInStrings {
        public static List<Character> findCommonCharacters(String str1, String str2) {
            // Create an ArrayList
            List<Character> commonChars = new ArrayList<>();

            // Creating a Set for storing unique
            Set<Character> set1 = new HashSet<>();

            // Adding characters
            for (char ch : str1.toCharArray()) {
                set1.add(ch);
            }

            // Checking the common characters
            for (char ch : str2.toCharArray()) {
                if (set1.contains(ch) && !commonChars.contains(ch)) {
                    commonChars.add(ch);
                }
            }

            return commonChars; // Return common characters list
        }

        public static void main(String[] args) {
            String str1 = "hello";
            String str2 = "world";
            List<Character> commonCharacters = findCommonCharacters(str1, str2);
            System.out.println(commonCharacters);
        }
    }


