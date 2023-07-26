package string;

public class FormatConcat {
    public static void main(String[] args) {
        String a = "Hello", b = "World";

        String str = String.format("%s %s", a, b);

        System.out.println(str);
    }
}
