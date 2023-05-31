// WAP in java to check whether the given number is a Armstrong or not

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        StringBuilder temp = new StringBuilder();

        temp.append(Integer.toString(num));

        int count = temp.length(), sum = 0;

        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(temp.charAt(i) + "");
            sum += Math.pow(n, count);
        }

        System.out.println(sum);

        if (num == sum) {
            System.out.println("The number " + num + " is an Armstrong");
        } else {
            System.out.println("The number " + num + " is not an Armstrong");
        }

        scanner.close();
    }
}
