public class DetermineEverygCharacter {
    public static void main(String[] args) {
        String str = "xxgx";

        System.out.println(areGCharactersHappy(str)); // Print the result
    }

    public static boolean areGCharactersHappy(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'g') {
                // Check if 'g' is happy
                boolean isHappy = (i > 0 && charArray[i - 1] == 'g') || (i < charArray.length - 1 && charArray[i + 1] == 'g');


                if (isHappy == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
