import java.util.Arrays;

public class FindingMaxTriple {
    public static void main(String[] args) {
        // Initializtion
        int[][] arrays = {
                {8, 10, 9},
                {6, 9, 3},
                {5, 2, 8}
        };

        // Loop through each array and print the maximum of elements
        for (int[] array : arrays) {
            System.out.println("Max of " + Arrays.toString(array) + ": " + maxTriple(array));
        }
    }

    // Method to find the maximum of the array
    public static int maxTriple(int[] nums) {
        if (nums.length >= 1) {  // Ensure the array has at least one element
            int first = nums[0];  // Store the first element
            int middle = nums[nums.length / 2];  // Store the middle element
            int last = nums[nums.length - 1];  // Store the last element

            // Return the maximum value among first, middle, and last
            return Math.max(first, Math.max(middle, last));
        }
        return nums[0];  // Return the only element if the array length is 1
    }
}
