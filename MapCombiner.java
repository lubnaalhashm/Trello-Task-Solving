import java.util.HashMap;

public class MapCombiner {

    public static void main(String[] args) {

        //Creating hash map and adding value
        HashMap<String, String> combineMap = new HashMap<>();
        combineMap.put("a", "Hi");
        combineMap.put("b", "There");

        System.out.println("map modification: " + combineValues(combineMap));
    }

    public static HashMap<String,String> combineValues(HashMap<String,String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            String value = mapAB.get("a")+mapAB.get("b");
            mapAB.put("ab", value);
        }
        // Return the updated map
        return mapAB;
    }
}
