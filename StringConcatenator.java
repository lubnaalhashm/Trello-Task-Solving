public class StringConcatenator {

    public static int largestOrZero(int a, int b, int c) {
        int[] nums = {a, b, c};
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Check if any two numbers are the same
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return 0;
                }
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {3, 2, 5},
        };

        // Using a for loop
        for (int[] testCase : testCases) {
            System.out.println(largestOrZero(testCase[0], testCase[1], testCase[2]));
        }
    }
}
