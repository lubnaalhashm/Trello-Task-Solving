import java.util.Scanner;

public class SumWithTeenRule {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("The sum is: " + noTeenSum(a, b, c));

        scanner.close();
    }

    public static int noTeenSum(int l1, int l2, int l3) {
        return fixTeen(l1) + fixTeen(l2) + fixTeen(l3);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }
}
