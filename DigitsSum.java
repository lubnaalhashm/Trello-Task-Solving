public class DigitsSum {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits("L73ubna"));
    }
    public static int sumDigits(String str) {
        int sum = 0; // Initialize sum to 0
        String[] charArray = str.split(""); // Split the string

        for (String s : charArray) { // Iterate over each character in the array
            // Check if the character is a digit
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                sum += Integer.parseInt(s); // Convert to int and add to sum
            }
        }


        return sum; // Return the total sum of digits
    }
}
