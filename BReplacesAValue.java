import java.util.HashMap;

public class BReplacesAValue {
    public static void main(String[] args) {

        // Here creating a hash map with adding values
        HashMap<Character, String> mapBully = new HashMap<>();
        mapBully.put('a', "candy");
        mapBully.put('b', "dirt");
        mapBully.put('c', "meh");

        // print in the output screen
        System.out.println("Map modification: " + moveValue(mapBully));
    }

    public static HashMap<Character, String> moveValue(HashMap<Character, String> valueMap) {
        // Checking 'a' in the map
        if (valueMap.containsKey('a')) {

            // Replacing the 'b' value with 'a' value
            valueMap.put('b', valueMap.get('a'));
            valueMap.put('a', "");
        }
        //return value map after changing
        return valueMap;
    }
}
