public class SumWithMultiplesOf5 {
    public static void main(String args[]) {
        int[] nums = {2, 5, 10, 4};
        int target = 19;
        boolean result = groupSum5(0, nums, target);

        //* print the result
        System.out.println(result);
    }

    public static boolean groupSum5(int index, int[] nums, int target) {
        //* base case
        if (index >= nums.length) {
            return target == 0;
        }

        int element = nums[index];
        if (element % 5 == 0) {
            if ((index < (nums.length - 1)) && (nums[index + 1] == 1)) {
                return groupSum5(index + 2, nums, target - element);
            }
            return groupSum5(index + 1, nums, target - element);
        }
        if (groupSum5(index + 1, nums, target - element)){
            return true;
        }
            return groupSum5(index + 1, nums, target);

    }
}