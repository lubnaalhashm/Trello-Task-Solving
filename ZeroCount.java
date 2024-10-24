import java.util.HashMap;
import java.util.Map;

public class ZeroCount {
    public static void main(String[] args) {

        //Creating array
        String[] arrayOfKeys = {"a", "b", "a", "b"};
        // calling a method
        Map<String, Integer> result = ValueToZero(arrayOfKeys);

        // Print the result
        System.out.println(result);

    }

    public static Map<String, Integer> ValueToZero(String[] keyArray)
    {
        // Creating a map
        Map<String, Integer> keysWithValueZero = new HashMap<>();

        // using loop
        for (String key : keyArray) {
            keysWithValueZero.putIfAbsent(key, 0);
        }

        //return the map
        return keysWithValueZero;
    }
}
