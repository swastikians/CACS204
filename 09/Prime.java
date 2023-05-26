import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 2) {
            System.out.println("Input number must be greater than or equal to 2.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is not a prime number");
        }
    }
}
