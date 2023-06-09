public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("The supplied arguments are:");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
