import java.util.HashMap;

public class ToppingChanger {
    public static void main(String[] args) {

        //creating hashmap and adding values
        HashMap<String, String> foodMap = new HashMap<>();
        foodMap.put("ice cream", "peanuts");

       // print the output screen
        System.out.println("map modification: " + modifyToppings(foodMap));
    }

    public static HashMap<String, String> modifyToppings(HashMap<String, String> foodMap) {
        // Check if ice cream in map
        if (foodMap.containsKey("ice cream")) {

            // Changing the value for ice cream to chery
            foodMap.put("ice cream", "chery");
        }
        // set value for bread to butter
        foodMap.put("bread", "butter");

        //return the foodMap after changing
        return foodMap;
    }
}
