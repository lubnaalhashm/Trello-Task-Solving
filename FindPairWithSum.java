import java.util.HashSet;
import java.util.Set;

public class FindPairWithSum {
    public static boolean hasPairWithSum(Integer[] numbers, int target) {
        Set<Integer> numbersSet = new HashSet<>();

        for (Integer number : numbers) {
            int difference = target - number;
            if (numbersSet.contains(difference)) {
                return true;
            }
            numbersSet.add(number); // Adding number
        }

        return false; // If there are no pairs, it will return false
    }

    public static void main(String[] args) {
        Integer[] input = {1, 4, 5, 7};
        int target = 6;

        boolean result = hasPairWithSum(input, target);
        System.out.println(result); // Print the output
    }
}
