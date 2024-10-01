import java.util.Arrays;

public class ArrayWithSeriesPattern {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3))); // [1, 1, 2, 1, 2, 3]
    }

    public static int[] seriesUp(int n) {
        // Calculate the size of the array
        int size = n * (n + 1) / 2;

        // Declare the array and initializtion
        int[] result;

        // create the array with the determined size
        result = new int[size];

        int index = 0;

        // Fill the array with the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }
}
