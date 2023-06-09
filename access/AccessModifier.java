package access;

public class AccessModifier {
    public static void main(String[] args) {
        Example example = new Example();

        // inaccessible
        // example.print();

        // works
        example.display();
    }
}

class Example {
    private int value = 10;
    public int num = 11;

    private void print() {
        System.out.println("My data is " + this.value);
    }

    public void display() {
        System.out.println("Hello from example " + this.value);
    }
}