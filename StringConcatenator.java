public class StringConcatenator{

    public static String minCat(String a, String b) {
        // Determine the lengths of the input strings
        int lengthA = a.length();
        int lengthB = b.length();

        // Find the minimum length
        int minLength = Math.min(lengthA, lengthB);

        return a.substring(lengthA - minLength) + b.substring(0, minLength);
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
}
