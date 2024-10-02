import java.util.Scanner;
import java.util.Arrays;

public class Front11 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        // Input array a
        System.out.print("Enter first array length : ");

        int aLength = inputUser.nextInt();
        int[] l = new int[aLength];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < aLength; i++) {
            l[i] = inputUser.nextInt();
        }


        System.out.print("Enter second array length: ");
        int bLength = inputUser.nextInt();
        int[] lu = new int[bLength];
        System.out.println("Enter first array elements: ");
        for (int i = 0; i < bLength; i++) {
            lu[i] = inputUser.nextInt();
        }

        // Call the method
        int[] result = front11(l, lu);
        System.out.println("The result is: " + Arrays.toString(result));

        inputUser.close();
    }

    public static int[] front11(int[] a, int[] b) {
        int count = 0;
        int[] front = new int[2];

        if (a.length > 0) {
            front[count] = a[0];
            count++;
        }

        if (b.length > 0) {
            front[count] = b[0];
            count++;
        }


        if (count == 0) {
            return new int[0];  // Return statement
        } else if (count == 1) {
            return new int[]{front[0]};  // Return array with one element
        } else {
            return front;  // Return the array with two elements
        }
    }
}
