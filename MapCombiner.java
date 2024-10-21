import java.util.HashMap;

public class MapCombiner {

    public static void main(String[] args) {

        //Creating hash map and adding value
        HashMap<Character, String> inputMap = new HashMap<>();
        inputMap.put('a', "Hi");
        inputMap.put('b', "There");

        System.out.println("Modified map: " + combineValues(inputMap));
    }

    public static HashMap<Character, String> combineValues(HashMap<Character, String> mapAB) {
        // Checking if 'a' and 'b' in  map
        if (mapAB.containsKey('a') && mapAB.containsKey('b')) {

            // Combine values of keys 'a' and 'b' and storing in the key 'c'
            mapAB.put('c', mapAB.get('a') + mapAB.get('b'));
        }

        // Return the updated map
        return mapAB;
    }
}
