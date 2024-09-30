public class DigitsSum {
    public static int sumDigits(String str) {
        int sum = 0;
        String[] Array = str.split(""); // Split the string
        for (String s : Array) {
            if (Character.isDigit(s.charAt(0))) {
                sum += Integer.parseInt(s); // Add the digit to the sum
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits("aa11b33"));
    }
}