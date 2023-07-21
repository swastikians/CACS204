package string;

public class Concat {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Script";
        int n = 4;
        String c = "Ever";

        // method 1
        System.out.println(a + b + n + c);

        // method 2
        System.out.println(a.concat(b).concat(n + c));

        String demo = 50 + 30 + "Hello" + 80;
        System.out.println(demo);
    }
}
