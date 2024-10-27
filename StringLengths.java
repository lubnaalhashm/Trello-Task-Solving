
import java.util.Map;

import java.util.HashMap;

public class StringLengths {

    public static void main(String args[]) {

        //*define ana array
        String[] letters = {"a", "bb", "a", "bb"};
        Map<String, Integer> stringLenght = str(letters);

        //* print the output
        System.out.println(stringLenght);
    }

    public static Map<String, Integer> str(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        //* using a loop
        for (String str : strings) {
            map.put(str, str.length());
        }

        //*return the map
        return map;
    }
}
