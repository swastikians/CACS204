public class JumpStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 5)
                    continue;
                System.out.println("j = " + j);
            }

            if (i == 7)
                break;
            System.out.println("i = " + i);
        }
    }
}
