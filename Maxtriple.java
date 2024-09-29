import java.util.Arrays;

public class Maxtriple {
    public static void main(String[] args) {
        int[][] arrays = {
                {8, 10, 9},
                {6, 9, 3},
                {5, 2, 8}
        };

        for (int[] array : arrays) {
            System.out.println("Max of " + Arrays.toString(array) + ": " + maxTriple(array));
        }
    }

    public static int maxTriple(int[] nums) {
        if (nums.length >= 1) {
            int first = nums[0];
            int middle = nums[nums.length / 2];
            int last = nums[nums.length - 1];


            return Math.max(first, Math.max(middle, last));
        }
        return nums[0];
    }
}
