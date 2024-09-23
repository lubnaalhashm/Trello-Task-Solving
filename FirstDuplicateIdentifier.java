public class FirstDuplicateIdentifier {
    public Character firstRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }
        return null; // No repeated character found
    }

    public static void main(String[] args) {
        FirstDuplicateIdentifier finder = new FirstDuplicateIdentifier();
        Character result = finder.firstRepeatedChar("swiss");

        if (result != null) {
            System.out.println("First repeated character: '" + result + "'");
        } else {
            System.out.println("No repeated character found.");
        }
    }
}
