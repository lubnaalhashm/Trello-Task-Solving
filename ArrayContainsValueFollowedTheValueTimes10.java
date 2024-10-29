import java.util.List;

public class ArrayContainsValueFollowedTheValueTimes10 {
    public static void main(String[] args) {

        Integer[] number = {3};

        System.out.println(array220(number, 0));
    }

    public static Boolean array220(Integer[] nums, Integer numbers) {
        //* base case
        if (nums.length - numbers <= 1) {
            return false;
        }
        if (nums[numbers + 1] == nums[numbers] * 10) {
            return true; //* Return true
        }


        return array220(nums, numbers + 1);
    }
}
