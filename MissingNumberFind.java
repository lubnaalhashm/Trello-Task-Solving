import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberFind {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 0, 1);
        int missingNumber = findMissingNumber(nums); // Find the missing number
        System.out.println(missingNumber);
    }

    // Method of missing number
    public static int findMissingNumber(List<Integer> nums) {
        int n = nums.size();
        Set<Integer> numSet = new HashSet<>(nums); // creating a set

        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                return i; // Return the missing number
            }
        }
        return -1;
    }
}
