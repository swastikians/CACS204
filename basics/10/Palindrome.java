// WAP in java to check whether the given number is a palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        StringBuilder temp = new StringBuilder();

        temp.append(Integer.toString(num));
        temp.reverse();

        int reverse = Integer.parseInt(temp.toString());

        if (num == reverse) {
            System.out.println("The number " + num + " is a palindrome");
        } else {
            System.out.println("The number " + num + " is not a palindrome");
        }

        scanner.close();
    }
}
