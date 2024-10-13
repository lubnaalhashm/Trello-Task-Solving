import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

    public class SumPairsFinding {
        public static List<Integer> countDistinct(int[] arr, int k) {
            List<Integer> result = new ArrayList<>(); // using the list to storing
            HashSet<Integer> set = new HashSet<>(); // using set to storing the element

            // initialize the set
            for (int i = 0; i < k; i++) {
                set.add(arr[i]); // adding all elements to the set
            }
            result.add(set.size());


            for (int i = k; i < arr.length; i++) {
                set.remove(arr[i - k]); // Removing the element
                set.add(arr[i]);        // Adding new element
                result.add(set.size());
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 4, 2, 3};
            int k = 4;
            List<Integer> distinctCounts = countDistinct(arr, k);
            System.out.println(distinctCounts); // print the result
        }
    }




