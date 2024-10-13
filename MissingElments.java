import java.util.HashSet;
import java.util.Set;

public class MissingElments {
    public static void main(String[] args) {
        int[] sortedNumbers = {1, 3, 5, 7};
        int startRange = 1;
        int endRange = 10;

        Set<Integer> missingNumbers = findMissingNumbers(sortedNumbers, startRange, endRange);
        System.out.println(missingNumbers); // print the output
    }

    public static Set<Integer> findMissingNumbers(int[] uniqueSortedNumbers, int rangeStart, int rangeEnd) {
        // Creating the set
        Set<Integer> missingNumbers = new HashSet<>();

        // Adding numbers to the set
        for (int i = rangeStart; i <= rangeEnd; i++) {
            missingNumbers.add(i);
        }

        for (int num : uniqueSortedNumbers) {
            missingNumbers.remove(num);
        }

        return missingNumbers; // Return the result
    }
}
