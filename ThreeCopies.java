
    public class ThreeCopies {
        public static void main(String[] args) {
            String[] testCases = {"Hello", "ab", "H", "", "Java"};

            for (String testCase : testCases) {
                System.out.println(extraFront(testCase)); // Outputs the result for each test case
            }
        }

        public static String extraFront(String str) {
            String prefix;
            if (str.length() < 2) {
                prefix = str;  // Use whatever is there if fewer than 2 chars
            } else {
                prefix = str.substring(0, 2);
            }
            return prefix + prefix + prefix;
        }
    }


