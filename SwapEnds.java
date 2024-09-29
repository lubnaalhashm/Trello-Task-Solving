import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {

        // Initialize two arrays for testing
        int[] firstArray = {1, 2, 3, 4};  // Example array with 4 elements
        int[] secondArray = {3, 6, 9, 12};  // Another example array with 4 elements

        // Call swapArrayEnds to swap the first and last elements of both arrays
        swapArrayEnds(firstArray);
        swapArrayEnds(secondArray);
    }

    // Method to swap the first and last elements of an array
    public static void swapArrayEnds(int[] nums) {
        // Store the first element in a temporary variable
        int temp = nums[0];

        // Assign the last element to the first position
        nums[0] = nums[nums.length - 1];

        // Assign the original first element (stored in temp) to the last position
        nums[nums.length - 1] = temp;

        // Print the modified array to the console
        System.out.println(Arrays.toString(nums));
    }
}
