public class UnaryOperator {
    public static void main(String[] args) {
        int a = 0;

        System.out.println("Prefix addition: " + (++a));
        System.out.println("Postfix addition: " + (a++));
        System.out.println("Value after addition: " + a);
        System.out.println("Prefix subtraction: " + (--a));
        System.out.println("Postfix subtraction: " + (a--));
        System.out.println("Value after subtraction: " + a);
    }
}
