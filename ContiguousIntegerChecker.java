import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContiguousIntegerChecker {

    public static void main(String[] args) {

        //taking input for user
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter the size of the set: ");
        int inputUser = scanner.nextInt();


        System.out.println("Enter the elements:");

        //using for loops
        for (int i = 0; i < inputUser; i++) {
            set.add(scanner.nextInt());
        }

        System.out.println(containsContiguousIntegers(set));
    }

    public static boolean containsContiguousIntegers(Set<Integer> set) {
        if (set.isEmpty()) {
            return false;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Finding the minimum and maximum
        for (int number : set) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // Checking if the set contains the integers
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
