public class FrontPiece {

    public static void main(String[] args) {
        int[] Array1 = {7, 8, 9};
        int[] Array2 = {7, 8};
        int[] Array3 = {7};

        // Test cases
        printArray(frontPiece(Array1));
        printArray(frontPiece(Array2));
        printArray(frontPiece(Array3));
    }

    public static int[] frontPiece(int[] arr) {
        // return the first 2 elements
        if (arr.length >= 2) {
            return new int[] {arr[0], arr[1]};
        }
        // return the array itself
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}