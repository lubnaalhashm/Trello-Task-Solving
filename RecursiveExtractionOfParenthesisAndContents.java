public class RecursiveExtractionOfParenthesisAndContents {

    public static void main(String[] args) {
        System.out.println(parenBit(("(xy)1"))); //* Test the function and print the output
    }

    public static String parenBit(String str) {

        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        return str; //* return str after update
    }
}

