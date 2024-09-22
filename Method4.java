public class Method4 {
    public boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        if (concatenated.contains(str2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Method4 method = new Method4();
        System.out.println(method.areRotations("abcd", "dabc")); // Output: true
    }
}
