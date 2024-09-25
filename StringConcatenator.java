public class StringConcatenator {

    // Method to concatenate two strings based on the specified rules
    public String minCat(String A, String B) {
        // Find the length of the shorter string
        int minLength = Math.min(A.length(), B.length());

        // Get the substrings from the end of each string
        String subA = A.substring(A.length() - minLength);
        String subB = B.substring(B.length() - minLength);

        // Concatenate the two substrings
        return subA + subB;
    }

    public static void main(String[] args) {
        StringConcatenator SC = new StringConcatenator();

        // Test cases
        System.out.println(SC.minCat("Hello", "Hi"));     // Output: "loHi"
        System.out.println(SC.minCat("Hello", "java"));   // Output: "ellojava"
        System.out.println(SC.minCat("java", "Hello"));   // Output: "javaello"
    }
}
