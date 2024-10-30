public class LargestRecursiveSubstringFinder  {
    public static void main(String[] args){

        //* Define the string of sub also the sub
        String str = "catcowcat";
        String sub = "cat";

        //* Print result
        System.out.println(str);
        System.out.println(sub);
        System.out.println("Result: " + strDist(str, sub));
             }


    public static Integer strDist(String str, String sub){

        //* return 0
        if (!str.startsWith(sub)&& !str.endsWith(sub) && !str.contains(sub))
        {
            return 0;
             }
        //* removing the start
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
              }

        //* removing the start
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
         }
           //* return length
        return str.length();
      }
}

