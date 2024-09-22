import java.util.HashSet;

public class Method6 {
    public Character firstRepeatedChar(String str) {
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }

        return null; // No repeats found
    }

    public static void main(String[] args) {
        Method6 method6 = new Method6();
        System.out.println(method6.firstRepeatedChar("swiss")); // Output: 's'
    }
}
