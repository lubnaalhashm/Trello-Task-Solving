public class CommonEndChecker {
    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})); // true
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
