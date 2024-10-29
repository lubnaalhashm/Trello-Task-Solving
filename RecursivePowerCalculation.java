public class RecursivePowerCalculation {
    public static void main (String[] args) {
        int base =4;
        int n =2;
        //* print the result
        System.out.println(powerN(base, n));
    }
    public static int powerN(int base, int n){
        if (n==1){ //* base case
            return base;
        }

        return base* powerN(base, n-1);
    }
}
