package string;

public class Program {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName.concat(" ").concat(lastName);

        String intro = "My name is " + fullName;

        System.out.println(intro);
    }
}
