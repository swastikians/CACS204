import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num < 100) {
            System.out.println("The number is less than 100");

            if (num > 50) {
                System.out.println("The number is greater than 50");
            } else {
                System.out.println("The number is not greater than 50");
            }
        } else {
            System.out.println("The number is greater than 100");
        }

        scanner.close();
    }
}
