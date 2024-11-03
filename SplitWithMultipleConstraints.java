import java.util.List;

public class SplitWithMultipleConstraints {

    public static void main(String[] args) {
        System.out.println(splitFunction(List.of( 6 ,9 ,5 ,10)));
    }

    public static boolean splitFunction(List<Integer> nums) {
        return spiltFunctionHelper(nums, 0, 0, 0);
    }

    public static boolean spiltFunctionHelper(List<Integer> numbers, int start, int sum5, int sum3) {
        if (start == numbers.size()) {
            return sum5 == sum3;
        }


        if (sum5 % 5 == 0) {

            return spiltFunctionHelper(numbers, start + 1, sum5 + sum5, sum3);
        }

        else if (sum5 % 3 == 0)
        {


            return spiltFunctionHelper(numbers, start + 1, sum5, sum3 + sum5);
        } else {

            return spiltFunctionHelper(numbers, start + 1, sum5 + sum5, sum3) ||
                    spiltFunctionHelper(numbers, start + 1, sum5, sum3 + sum5);
        }
    }
}
