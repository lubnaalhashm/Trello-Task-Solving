import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {3, 6, 9, 12};

        swapArrayEnds(firstArray);
        swapArrayEnds(secondArray);
    }

    public static void swapArrayEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
