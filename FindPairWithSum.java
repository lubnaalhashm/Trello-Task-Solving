import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindPairWithSum {
    public static boolean hasPairWithSum(int[] numbers, int num) {
        Set<Integer> complements = new HashSet<>();
        for (int number : numbers) {
            int difference = num - number;
            if (complements.contains(difference)) { //Check for the difference
                return true;
            }
            complements.add(number); // Adding the number
        }
        return false; // if there is no pair it will return false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        // print the output
        System.out.println("Enter target sum:");
        int targetSum = scanner.nextInt();

        boolean result = hasPairWithSum(numbers, targetSum);
        System.out.println(result);
        scanner.close();
    }
}
