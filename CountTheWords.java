import java.util.Map;
import java.util.HashMap;

public class CountTheWords {
    public static void main(String[] args) {
        // Define the array
        String[] inputWords = {"a", "b", "a", "c", "b"};

        Map<String, Integer> resultMap = countWord(inputWords);

        // Print the result
        System.out.println(resultMap);
    }

    public static Map<String, Integer> countWord(String[] words) {
        // Creating map
        Map<String, Integer> countMap = new HashMap<>();

        //* using loop
        for (String word : words) {

            Integer currentCount = countMap.get(word);

            if (currentCount != null) {
                countMap.put(word, currentCount + 1);
            } else {
                countMap.put(word, 1);
            }
        }

        return countMap;
    }
}
