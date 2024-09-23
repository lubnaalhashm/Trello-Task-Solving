public class RotationChecker {
    public boolean areRotations(String str1, String str2) {
        // Check if lengths are the same
        if (str1.length() != str2.length()) return false;

        // Check if str2 is a substring of str1 concatenated with itself
        return (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        RotationChecker checker = new RotationChecker();
        System.out.println(checker.areRotations("abcd", "dabc"));
    }
}
