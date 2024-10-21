import java.util.HashMap;

public class IngredientsChanger {
    public static void main(String[] args) {

        //Creating a hashmap with values
        HashMap<String, String> ingredientMap = new HashMap<>();
        ingredientMap.put("spinach", "dirt");
        ingredientMap.put("ice cream", "cherry");
        System.out.println("Map modification " + adjustMap(ingredientMap));
        //Creating another hashmap with new values
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("ice cream", "cherry");
        System.out.println("Map modification: " + adjustMap(map2));

        //Creating the last hashmap
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");
        System.out.println("Map modification: " + adjustMap(map3));
    }

    public static HashMap<String, String> adjustMap(HashMap<String, String> ingredientMap) {
        // checking if ice cream in the map
        if (ingredientMap.containsKey("ice cream")) {
            // changing the yogurt to ice cream value
            ingredientMap.put("yogurt", ingredientMap.get("ice cream"));
        }
        // checking if spinach in the map
        if (ingredientMap.containsKey("spinach")) {
            // Changing value of spinach to nuts
            ingredientMap.put("spinach", "nuts");
        }
        //return the modified map
        return ingredientMap;
    }
}
