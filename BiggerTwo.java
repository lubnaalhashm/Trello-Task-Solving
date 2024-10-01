public class BiggerTwo {


    public static void main(String[] args) {
        int[] A = {9, 4};
        int[] B = {7, 1};

        // Call the method and display the result
        int[] result = biggerTwo(A, B);
        System.out.print("The larger sum: [");
        System.out.print(result[0] + ", " + result[1]);
        System.out.println("]");
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        // Calculate the sum of both arrays
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];


        if (sumA >= sumB) {
            return a;  // Return A in case of a tie or if a has a larger sum
        } else {
            return b;
        }
    }
}


