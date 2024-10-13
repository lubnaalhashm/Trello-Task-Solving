import java.util.List;
import java.util.ArrayList;

public class TwoArraysIntersection {
    public static void main(String[] args) {

        // Define the first list
        List<Integer> firstList = List.of(1, 2, 2, 3);

        // Define the second list
        List<Integer> secondList = List.of(2, 2);

        //Finding the intersection
        List<Integer> intersection = findIntersection(firstList, secondList);

        System.out.println(" Arrays Intersection: " + intersection); //print in the output screen
    }
  // Method for finding the intersection
    public static List<Integer> findIntersection(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int num : firstList) {
            if (secondList.contains(num) && !intersectionList.contains(num)) {
                intersectionList.add(num);
            }
        }

        return intersectionList;
    }
}
