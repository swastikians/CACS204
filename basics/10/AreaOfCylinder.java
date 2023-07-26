import java.util.Scanner;

public class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the radius of cylinder:");
        float r = obj.nextFloat();
        System.out.println("enter the height of cylinder :");
        float h = obj.nextFloat();

        System.out.println("the area of cylinder is " + (Math.PI * Math.pow(r, 2) * h));
        obj.close();
    }
}
