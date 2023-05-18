// WAP in Java to calculate volume of cylinder by taking input from the user

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        float r, h;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of r");
        r = scanner.nextFloat();

        System.out.println("Enter the value of h");
        h = scanner.nextFloat();

        float result = calculate(r, h);

        System.out.println("The volume of cylinder is " + result);

        scanner.close();
    }

    public static float calculate(float r, float h) {
        return (float)(Math.PI * Math.pow(r, 2) * h);
    }
}
