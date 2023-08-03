package string;

import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println("[Uppercase]: " + str.toUpperCase());
        System.out.println("[Lowercase]: " + str.toLowerCase());

        scanner.close();
    }
}
