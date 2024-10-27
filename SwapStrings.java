import java.util.Map;
import java.util.HashMap;

public class SwapStrings {

     public static void main(String[] args) {

        //* Initialize the array
        String[] stringsArray = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        //* Call method
        swapElements(stringsArray);

        //* print the output
        for (String str : stringsArray) {
            System.out.print(str + " ");
        }
    }

    public static void swapElements(String[] arrayOfStrings) {

        Map<String, Integer> firstCharIndexMap = new HashMap<>();

        for (int i = 0; i < arrayOfStrings.length; i++) {

            String substring = arrayOfStrings[i].substring(0, 1);

            if (firstCharIndexMap.containsKey(substring)) {

                int indexToSwap = firstCharIndexMap.get(substring);

                //8 swap the string
                String temperory = arrayOfStrings[i];
                arrayOfStrings[i] = arrayOfStrings[indexToSwap];
                arrayOfStrings[indexToSwap] = temperory;


                firstCharIndexMap.remove(substring);
            } else {

                firstCharIndexMap.put(substring, i);
            }
        }
    }
}
