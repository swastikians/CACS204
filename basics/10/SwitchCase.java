import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int n = scanner.nextInt();

        scanner.close();

        switch (n) {
            case 10:
                System.out.println("The value is 10");
                break;
            case 11:
                System.out.println("The value is 11");
                break;
            default:
                System.out.println("The value is neither 10, nor 11");
                break;
        }
    }
}