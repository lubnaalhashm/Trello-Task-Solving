public class StringModificationWithStarSeparator {
 public static void main(String args[])  {
     String userInput = "ab";
     System.out.println(allstar(userInput)); //* print the modified result
 }
 public static String  allstar(String str){
     if (str.length() <= 1){
         return str; //* return str
     }
     else
     {
        return str.substring(0,1) + "*" + allstar(str.substring(1)); //* Recursive case:
     }
 }

}