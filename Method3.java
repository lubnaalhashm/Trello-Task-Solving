public class Method3 {
    public String removeCharacter(String str, char ch) {
        String result = "";

        for (char Lu : str.toCharArray()) {
            if (Lu != ch) {
                result += Lu;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Method3 method = new Method3();
        System.out.println(method.removeCharacter("hello world", 'l'));
    }
}
