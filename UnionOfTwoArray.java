import java.util.HashSet;
import java.util.Set;

    public class UnionOfTwoArray {
        public static Set<Integer> unionOfArrays(Set<Integer> set1, Set<Integer> set2) {
            Set<Integer> unionSet = new HashSet<>(set1);
            unionSet.addAll(set2); // adding element
            return unionSet; // union set return
        }

        public static void main(String[] args) {
            // Create sets for the arrays
            Set<Integer> array1 = new HashSet<>();
            array1.add(1);
            array1.add(2);
            array1.add(2); // duplicate

            Set<Integer> array2 = new HashSet<>();
            array2.add(3);
            array2.add(4);
            array2.add(4); // duplicate

            Set<Integer> result = unionOfArrays(array1, array2);
            System.out.println(result);
        }
    }


