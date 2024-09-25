public class FirstLastSix {
    public static void main(String[] args) {
        // Test cases
        System.out.println(firstLast6(new int[]{1, 2, 6})); // → true
        System.out.println(firstLast6(new int[]{6, 1, 2, 3})); // → true
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3})); // → false
    }

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
