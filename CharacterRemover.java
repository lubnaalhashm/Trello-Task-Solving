public class CharacterRemover {

    public String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        CharacterRemover remover = new CharacterRemover();
        System.out.println(remover.removeCharacter("hello world", 'l'));
    }
}
