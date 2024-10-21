import java.util.HashMap;

public class TheToppingChanger {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        System.out.println(fixToppings(map));
    }

    public static HashMap<String, String> fixToppings(HashMap<String, String> options) {
        // Check if the values in the map
        if (options.containsKey("potato")) {
            options.put("fries", options.get("potato"));
        }

        if (options.containsKey("salad")) {
            options.put("spinach", options.get("salad"));
        }
        return options;
    }
}
