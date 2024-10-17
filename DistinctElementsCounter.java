import java.util.HashSet;
import java.util.Set;

public class DistinctElementsCounter {
    public static void main(String[] args) {

        //Declaration and initialization
        Set<Integer> array = new HashSet<>();
        array.add(1);
        array.add(5);
        array.add(7);
        array.add(-1);
        array.add(5);
        int target = 6;

        // Calling method
        Set<Set<Integer>> result = findingUniquePairs(array, target);
        System.out.println(result);
    }

    public static Set<Set<Integer>> findingUniquePairs(Set<Integer> arr, int target) {
        Set<Integer> elements = new HashSet<>();
        Set<Set<Integer>> uniquePairs = new HashSet<>();

        // Using for loop to iterate in the set
        for (int number : arr) {
            int c = target - number;
            if (elements.contains(c)) {
                Set<Integer> pair = new HashSet<>();
                pair.add(number);
                pair.add(c);
                uniquePairs.add(pair);  // Adding pair to the set
            }
            elements.add(number);  // Adding number
        }

        return uniquePairs;  // Return the result
    }
}
