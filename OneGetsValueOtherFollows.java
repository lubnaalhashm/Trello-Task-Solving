import java.util.HashMap;
import java.util.Map;

public class OneGetsValueOtherFollows {

    public static void main(String[] args) {
        //* creating a hash map
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");

        //* call the method and print the result
        System.out.println(getValue(map));
    }

    public static Map<String, String> getValue(Map<String, String> map) {

        String Value1 = map.get("a");
        String Value2 = map.get("b");

        if (Value1 != null && Value2 == null) {
            map.put("b", Value1);
                         }

        else if (Value2 != null && Value1 == null) {
            map.put("a", Value2);
                      }

        return map; //* return the map
    }
}
