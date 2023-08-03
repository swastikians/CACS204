package string;

public class IntegerToString {
    public static void main(String[] args) {
        int a = 10, b = -10;

        String str1 = Integer.toString(a);
        String str2 = b + "";

        System.out.println(str1);
        System.out.println(str2);

        Double d = 10.5;

        System.out.println(String.valueOf(d));
    }
}
