import java.util.HashMap;

public class Method5 {
    public char mostFrequentChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        // Count the frequency of each character
        for (char Lu : str.toCharArray()) {
            int count = charCount.getOrDefault(Lu, 0) + 1;
            charCount.put(Lu, count);
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = Lu;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Method5 method = new Method5();
        System.out.println(method.mostFrequentChar("success"));
    }
}
