public class StaticVariable {
    public static int identifier = 0xCAFE;

    public static void main(String[] args) {
        System.out.println("The identifier is " + StaticVariable.identifier);
    }
}
