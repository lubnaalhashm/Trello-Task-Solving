public class OccurrenceFinder {
    public int countOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;


        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        OccurrenceFinder method = new OccurrenceFinder();
        System.out.println(method.countOccurrences("banana", "ana"));
    }
}
