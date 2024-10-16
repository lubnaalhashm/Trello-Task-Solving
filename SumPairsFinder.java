import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumPairsFinder {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 1, 3, 4, 2, 3);
        int k = 4;
        List<Integer> result = countDistinctInWindows(arr, k);
        System.out.println(result);
    }


    public static List<Integer> countDistinctInWindows(List<Integer> arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= arr.size() - k; i++) { // using for loops
            HashSet<Integer> uniqueElements = new HashSet<>(arr.subList(i, i + k));
            result.add(uniqueElements.size()); //Adding the count
        }

        return result;
    }
}
