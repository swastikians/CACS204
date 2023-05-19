// WAP in Java to calculate the addition, subtraction, multiplication and division of two given numbers

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        float a = scanner.nextFloat();

        System.out.println("Enter second number");
        float b = scanner.nextFloat();

        scanner.close();

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
