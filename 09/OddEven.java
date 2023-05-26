import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The given number is even number");
        } else {
            System.out.println("The given number is odd number");
        }

        Math.max(1, 2);

        scanner.close();
    }
}
