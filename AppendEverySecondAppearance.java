import java.util.*;

public class AppendEverySecondAppearance {
    public static void main(String[] args) {
        // Predefined array of strings for testing
        String[] arr = {"a","b", "a", "c","a", "d", "a", "b","b", "c"};


        if (arr.length == 0) {
            System.out.println("it is not valid.");
            return;
        }

        // Print the result
        System.out.println("The array: " + Arrays.toString(arr));
        System.out.println("Result: " + wordAppend(arr));
    }

    public static String wordAppend(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String currString : arr) {

            if (map.containsKey(currString)) {

                int count = map.get(currString);
                count++;


                map.put(currString, count);


                if (count % 2 == 0) {
                    result.append(currString);
                }
            } else {map.put(currString, 1);
            }
        }
        return result.toString(); // Return the result
    }
}
