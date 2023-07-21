package exceptionhandling;

public class TryCatch {

    public static void arithmeticException() {
        try {
            int a = 4 / 0;

            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred!\n" + e.getMessage());
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!\n" + e.getMessage());
        }
    }

    public static void nullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception!\n" + e.getMessage());
        }
    }

    public static void customException() {
        try {
            throw new CustomException("Custom exception occurred!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed!");
        }
    }

    public static void main(String[] args) {
        arithmeticException();
        arrayIndexOutOfBoundsException();
        nullPointerException();
        customException();
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super("This is a custom exception: " + message);
    }

    public String toString() {
        return "Custom exception occurred!";
    }
}
