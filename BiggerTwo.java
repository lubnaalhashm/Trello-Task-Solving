import java.util.Arrays;

public class BiggerTwo {

    public static void main(String[] args) {
        int[] A = {9, 4};
        int[] B = {7, 1};

        // Call the method and display the result
        int[] result = findingBiggerTwo(A, B);
        System.out.println("The larger sum: " + Arrays.toString(result)); //  print the array
    }

    public static int[] findingBiggerTwo(int[] a, int[] b) {
        // Calculate the sum of both arrays
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA >= sumB) {
            return a;  // Return A
        } else {
            return b;
        }
    }
}
