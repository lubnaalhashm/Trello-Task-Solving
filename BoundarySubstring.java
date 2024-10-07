public class BoundarySubstring {

    public static String without2(String str) {
        int len = str.length();
        if (len == 2 || (len > 2 && str.substring(0, 2).equals(str.substring(len - 2)))) {
            return str.substring(2);
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println(without2("HelloHe"));  // Output: "lloHe"
        System.out.println(without2("HelloHi"));  // Output: "HelloHi"
        System.out.println(without2("Hi"));       // Output: ""
    }
}
