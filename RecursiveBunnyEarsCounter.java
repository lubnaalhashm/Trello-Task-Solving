public class RecursiveBunnyEarsCounter {
    public static void main (String args[]) {
      int n1 = 0;
      int n2 = 1;
      int n3 = 2;

      //* print the output
        System.out.println(bunnyEars2(n1));
        System.out.println(bunnyEars2(n2));
        System.out.println(bunnyEars2(n3));

    }
    public static Integer bunnyEars2(int n) {
        if (n== 0){
            return 0;
        }

        else{
            if(n%2 != 0){
                return 2 + bunnyEars2(n-1);
            }
            else{
                return 3+ bunnyEars2(n-1);
            }
        }

    }
}

