public class LocalVariable {
    public static void main(String[] args) {
        int var = 10;
        System.out.println(var);

        {
            int var2 = 55;
            System.out.println(var2);

            // both var2 and var can be accessed here since it is in the scope of main()
        }

        // var2 cannot be accessed here since it is not local to the scope of main()
    }
}
