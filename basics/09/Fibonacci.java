public class Fibonacci {
    public static void fib(int a, int b, int c) {
        if (c < 1) return;
        
        System.out.println(b);

        fib(b, a + b, --c);
    }

    public static void main(String[] args) {
        fib(1, 0, 10);
    }
}
