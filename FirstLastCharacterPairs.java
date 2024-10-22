import java.util.HashMap;
import java.util.Map;

class FirstLastCharacterPairs {
    public static void main(String[] args) {
        String[] input = {"code", "bug"};
        Map<String, String> result = map(input);
        System.out.println(result);
    }
public static Map<String, String> map(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (String str : strings)
    {
        // Check if the string is not empty
        if (str.length() > 0) {
            String key = String.valueOf(str.charAt(0));
            String value = (String.valueOf(str.charAt(str.length() - 1)));
            map.put(key, value);
        }
    }
    return map; // Return the map
}
}
