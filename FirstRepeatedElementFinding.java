import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedElementFinding {
    public static void main(String[] args) {
        // Define integers list
        List<Integer> nums = List.of(2, 5, 1, 2, 3); // using the array list
        findFirstDuplicate(nums); // call a method
    }

    public static void findFirstDuplicate(List<Integer> nums) {
        Set<Integer> checkedNumbers = new HashSet<>();
        for (int number : nums) {
            if (!checkedNumbers.add(number)) { // adding number to the set
                System.out.println(number);
                return;
            }
        }
        System.out.println("There are no duplicates");
    }
}