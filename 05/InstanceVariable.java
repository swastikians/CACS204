public class InstanceVariable {
    public String name;

    public InstanceVariable() {
        this.name = "Code Wizard";
    }

    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable();

        System.out.println(iv.name);
    }
}
