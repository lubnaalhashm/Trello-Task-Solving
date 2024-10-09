
import java.util.HashSet;
import java.util.Set;

    public class CheckIfTwoArraysAreDisjoint {
        public static boolean areDisjoint(int[] array1, int[] array2) {
            Set<Integer> set = new HashSet<>();

            // Adding the first array elements in the set
            for (int num : array1) {
                set.add(num);
            }

            // Check if any element in the set
            for (int num : array2) {
                if (set.contains(num)) {
                    return false; // if there is common element
                }
            }

            return true; // if No elements there
        }

        public static void main(String[] args) {
            System.out.println(areDisjoint(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
            System.out.println(areDisjoint(new int[]{1, 2, 3}, new int[]{3, 4, 5}));
        }
    }

