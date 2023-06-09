package value;

public class PassByValue {
    public int a = 100;

    public void change(int a) {
        System.out.println("-> Old value of a: " + a);
        a += 100;
        System.out.println("-> New value of a: " + a);
    }

    public static void main(String[] args) {
        PassByValue obj = new PassByValue();

        System.out.println("Before change: " + obj.a);
        obj.change(obj.a);
        System.out.println("After change: " + obj.a);
    }
}
