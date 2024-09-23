public class MaxFrequencyCharacter {

    public static char mostFrequentChar(String str) {
        int[] count = new int[256]; // Assuming ASCII characters
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            count[ch]++;
            if (count[ch] > maxCount) {
                maxCount = count[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "success";
        System.out.println("Most frequent character: '" + mostFrequentChar(input) + "'");
    }
}
