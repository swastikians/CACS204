package string;

public class StringComparison {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = "Goodbye";
        String d = "Later";

        // compare a to a
        System.out.println(a.compareTo(a));
        // compare a to b
        System.out.println(a.compareTo(b));
        // compare a to c
        System.out.println(a.compareTo(c));
        // compare a to d
        System.out.println(a.compareTo(d));

        System.out.println("Empty String Comparison");

        String e = "";
        String f = "Hello";

        // compare e to f
        System.out.println(e.compareTo(f));
        // compare f to e
        System.out.println(f.compareTo(e));

        System.out.println("String Comparison");

        String g = "Hello WORLD";
        String h = "hello world";

        // compare g to h
        System.out.println(g.compareTo(h));

            ;;;;;;;;
        ;;;;;;;;;;;;;;;;;
       ;;;;;;;;;;;;;;;;;;;
       ;;;;;;       ;;;;;;
       ;;;;;;       ;;;;;;
       ;;;;;;       ;;;;;;
       ;;;;;;       ;;;;;;
       ;;;;;;       ;;;;;;
       ;;;;;;;;;;;;;;;;;;;
        ;;;;;;;;;;;;;;;;;
            ;;;;;;;;
    }
}
