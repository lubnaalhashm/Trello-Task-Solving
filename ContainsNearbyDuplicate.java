import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {


    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));  // Print the output: true
    }

    public static boolean containsNearbyDuplicate(Integer[] nums, int K) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            if (set.size() > K) {
                set.remove(nums[i - K]); // Remove the element
            }
        }
        return false; // Return false if no nearby duplicate there
    }
}
