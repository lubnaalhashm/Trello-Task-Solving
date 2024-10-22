import java.util.HashMap;

public class IngredientsModification {
    public static void main(String[] args) {

        // Create a map
        HashMap<String, String> ingredient = new HashMap<>();
        ingredient.put("ice cream", "cherry");
        ingredient.put("yogurt", "salt");
        ingredient.put("spinach", "dirt");
        adjustment(ingredient);
    }

    public static void adjustment(HashMap<String, String> map) {

        System.out.println("Before the map modification : " + map);
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        System.out.println("After the map modification: " + map); // Print the map after changes
    }
}
