package string;

public class JoinConcat {
    public static void main(String[] args) {
        String a = "Java", b = "Script";

        String str = String.join("", a, b);

        System.out.println(str);
    }
}
