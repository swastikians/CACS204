// WAP in Java to calculate the addition, subtraction, multiplication and division of two numbers

public class BasicCalculator {
    public static void main(String[] args) {
        float a = 54f, b = 78f;

        System.out.println("Calculation");
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }

    public static void add(float a, float b) {
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b); 
    }

    public static void subtract(float a, float b) {
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
    }

    public static void multiply(float a, float b) {
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
    }

    public static void divide(float a, float b) {
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
    }
}
