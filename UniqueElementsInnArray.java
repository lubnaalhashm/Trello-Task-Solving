import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementsInnArray {
    public static void main(String[] args) {
        // Input array and some of the duplicate elements which is 1
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);
        input.add(1);
        // Set to storing
        Set<Integer> uniqueSet = new HashSet<>();

        // Adding the number to the set
        for (int num : input) {
            uniqueSet.add(num);
        }

        // Converting
        List<Integer> result = new ArrayList<>(uniqueSet);

        // Printing
        System.out.println(result);
    }
}
