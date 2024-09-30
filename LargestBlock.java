public class LargestBlock {
    public static void main(String[] args) {

        String  TestString= "Luuuubbbbnnnnaa";
        System.out.println("The Largest character count in '" + TestString + "': " + maxBlock(TestString));
    }

    public static int maxBlock(String str) {
        int theLargestBS = 0;
        int currentBS = 1;

        // Return 0 for an empty string
        if (str.length() == 0) {
            return 0;
        }


        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBS++;  // Increment current block size
            } else {

                theLargestBS = Math.max(theLargestBS, currentBS);
                currentBS = 1;  // Reset current block size for new character
            }
        }

        // Final check for the last block
        theLargestBS = Math.max(theLargestBS, currentBS);

        return theLargestBS;  // Return the size of the largest block
    }
}
