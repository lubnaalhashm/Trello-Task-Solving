public class LargestBlock {
    public static void main(String[] args) {

        String  TestString= "Luuuubbbbnnnnaa";
        System.out.println("The Largest character count in '" + TestString + "': " + maxBlock(TestString));
    }

    public static int maxBlock(String str) {
        int TheLargestBS = 0;
        int CurrentBS = 1;

        // Return 0 for an empty string
        if (str.length() == 0) {
            return 0;
        }


        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                CurrentBS++;  // Increment current block size
            } else {

                TheLargestBS = Math.max(TheLargestBS, CurrentBS);
                CurrentBS = 1;  // Reset current block size for new character
            }
        }

        // Final check for the last block
        TheLargestBS = Math.max(TheLargestBS, CurrentBS);

        return TheLargestBS;  // Return the size of the largest block
    }
}
