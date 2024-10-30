import java.util.ArrayList;
import java.util.List;

public class ArraySplitMultipleConstraints {

    public static void main(String args[]) {

    }

    public static Boolean splitArray(ArrayList<Integer> nums) {
        return spiltHelperFunction(0, nums, 0, 0);

    }

    public static Boolean spiltHelperFunction(int start, ArrayList<Integer> nums, int sumG1, int sumG2) {
        if (start == nums.size()) {
            return sumG1 == sumG2;
        }
        nums.add(start);
        int currentValue = nums.indexOf(start);
        return spiltHelperFunction(start + 1, nums, sumG1 + currentValue, sumG2) ||
                spiltHelperFunction(start + 1, nums, sumG1, sumG2 + currentValue);
    }

}