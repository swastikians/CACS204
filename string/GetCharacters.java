package string;

public class GetCharacters {
    public static void main(String[] args) {
        String str = "Hello from Java program.";
        char[] language = new char[5];

        str.getChars(str.indexOf('J'), str.indexOf('p') - 1, language, 0);

        System.out.println(language);
    }
}
