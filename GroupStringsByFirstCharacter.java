import java.util.HashMap;
import java.util.Map;

public class GroupStringsByFirstCharacter {

    public static void main(String[] args) {
        String[] input = {"salt", "tea", "soda", "toast"};

        //print the result
        System.out.println(firstChar(input));
    }

    // Creating a map
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> theResult = new HashMap<>();

        for (String str : strings) {
            String firstCharater = str.substring(0, 1);
            if (theResult.containsKey(firstCharater)) {
                theResult.put(firstCharater, theResult.get(firstCharater) + str);
            } else {
                theResult.put(firstCharater, str);
            }
        }

        return theResult;
    }
}
