import java.util.ArrayList;
import java.util.List;

public class ArraySplitMultipleConstraints {

    public static void main(String[] args) {

        //* Calling methods and print the output
        System.out.println(splitArray(new ArrayList<>(List.of(5 ,2 , 3 )))); // true
    }

    //* Method for checking if the array can be split
    public static Boolean splitArray(ArrayList<Integer> nums) {
        return splitHelperFunction(0, nums, 0, 0);
    }

    //* Helper function
    public static Boolean splitHelperFunction(int start, ArrayList<Integer> nums, int sumG1, int sumG2) {
        //* base case
        if (start == nums.size()) {
            return sumG1 == sumG2;
        }

        int currentValue = nums.get(start);

        return splitHelperFunction(start + 1, nums, sumG1 + currentValue, sumG2) ||
                splitHelperFunction(start + 1, nums, sumG1, sumG2 + currentValue);
    }
}
