public class Method2 {
    public String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        int maxLength = 0;

        // Iterate through each word in the array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Method2 method = new Method2();
        System.out.println(method.longestWord("The quick brown fox jumped over the lazy dog"));
    }
}
