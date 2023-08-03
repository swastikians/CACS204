package string;

public class IndexOf {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";

        System.out.println(s.indexOf("fox"));
        System.out.println(s.indexOf("e", 14));
    }
}
