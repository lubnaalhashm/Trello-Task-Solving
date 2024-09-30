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
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return str.charAt(i);
            }
        }
        return null;
    }
}
