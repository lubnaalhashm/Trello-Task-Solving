import java.util.Arrays;

public class FrontPiece {

    public static void main(String[] args) {
        int[] array1 = {7, 8, 9};
        int[] array2 = {7, 8};
        int[] array3 = {7};

        // Test cases
        printArray(frontPiece(array1));
        printArray(frontPiece(array2));
        printArray(frontPiece(array3));
    }

    public static int[] frontPiece(int[] arr) {
        // Return the first 2 elements
        if (arr.length >= 2) {
            return new int[] {arr[0], arr[1]};
        }
        // Return the array itself
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr)); // Using Arrays.toString() to print the array
    }
}
