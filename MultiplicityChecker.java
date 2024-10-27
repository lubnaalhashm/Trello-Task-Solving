import java.util.HashMap;
import java.util.Map;

public class MultiplicityChecker {
    public static void main(String[] args) {

        //*creating an array
        String[] array = {"a", "b", "a", "c", "b"};
        //* print in the output
        System.out.println(Multiple(array));

    }

    public static Map<String, Boolean> Multiple(String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String str : words) {
            if (map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }

        for (String word : map.keySet()) {
            int count = 0;
            for (String checkWord : words) {
                if (checkWord.equals(word)) {
                    count++;
                }
            }
            if (count >= 2) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        //* Return the map
        return map;
    }
}
