import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter an expression (eg: a+b)");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?<n1>\\d+)\\W?(?<op>\\+|\\-|\\*|\\/)\\W?(?<n2>\\d+)$");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        if (matcher.matches()) {
            int num1 = Integer.parseInt(matcher.group("n1"));
            int num2 = Integer.parseInt(matcher.group("n2"));
            char op = matcher.group("op").charAt(0);

            System.out.println("\n\n");

            switch (op) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operator " + op);
                    break;
            }
        } else {
            System.out.println("The expression is invalid");
        }

        scanner.close();
    }
}
