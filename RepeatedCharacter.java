public class RepeatedCharacter {

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("repated char: " +firstRepeatedChar(str));

    }

    public static Character firstRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }
        return null; // No repeated character found
    }
}
