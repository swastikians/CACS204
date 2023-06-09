import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter obtained marks");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 50) {
            System.out.println("Fail");
        } else if (num >= 50 && num < 60) {
            System.out.println("D Grade");
        } else if (num >= 60 && num < 70) {
            System.out.println("C Grade");
        } else if (num >= 70 && num < 80) {
            System.out.println("B Grade");
        } else if (num >= 80 && num < 90) {
            System.out.println("A Grade");
        }  else if (num >= 90 && num < 100) {
            System.out.println("A+ Grade");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
