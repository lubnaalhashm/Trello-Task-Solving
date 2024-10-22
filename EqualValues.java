import java.util.HashMap;
import java.util.Scanner;

public class EqualValues {

    public static void main(String[] args) {
        HashMap<String, String> inputMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Loop to take input form the user
        System.out.println("Enter numbers:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the key: ");
            String key = scanner.nextLine();
            System.out.print("Enter the value: ");
            String value = scanner.nextLine();
            inputMap.put(key, value);
        }

        System.out.println("Map before modification: " + inputMap);
        removeKeysWithEqualValues(inputMap);
        scanner.close();
    }

    public static void removeKeysWithEqualValues(HashMap<String, String> inputMap) {
        if (inputMap.containsKey("a") && inputMap.containsKey("b")
                && inputMap.get("a").equals(inputMap.get("b"))) {
            inputMap.remove("a");
            inputMap.remove("b");

            System.out.println("Map after modification: " + inputMap);
        }
    }
}
