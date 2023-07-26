package string;

public class StringBuilderConcat {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "World";

        String str = new StringBuilder()
            .append(s1)
            .append(" ")
            .append(s2)
            .toString();

        System.out.println(str);
    }
}
