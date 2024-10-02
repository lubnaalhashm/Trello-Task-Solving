import java.util.Scanner;

public class RepeatedCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to find the first repeated character: ");
        String str = scanner.nextLine();
        System.out.println("Repeated char: " + firstRepeatedChar(str));
        scanner.close();
    }

    public static Character firstRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check the subsequent characters
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    return currentChar; // Return the first repeated character
                }
            }
        }
        return null; // No repeated character
    }
}
