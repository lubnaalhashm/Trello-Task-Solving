import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesChecking {
    public static boolean hasDuplicates(List<Integer> nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                return true; // in case if  number there it will return true
            }
            numbers.add(num); //Adding number to the set
        }
        return false; // Return false in case no duplicates
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicates(List.of(1, 2, 3, 1)));
        System.out.println(hasDuplicates(List.of(1, 2, 3)));
    }
}
