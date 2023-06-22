package inheritance;

public class ObjectClass {
    public static Object getObject() {
        double random = Math.floor(Math.random() * 10);

        if (random > 7) {
            return new Sheep();
        } else if (random < 7 && random > 2) {
            return new Apple();
        } else {
            return new ObjectClass();
        }
    }

    public static void main(String[] args) {
        Object obj = getObject();

        if (obj instanceof Apple) {
            System.out.println("Object is Apple");
            ((Apple)obj).eat();
        } else if (obj instanceof Sheep) {
            System.out.println("Object is Sheep");
            ((Sheep)obj).speak();
        } else {
            System.out.println("I don't know what this object is...");
        }
    }
}

class Sheep {
    public void speak() {
        System.out.println("Baaaaa");
    }
}

class Apple {
    public void eat() {
        System.out.println("An apple a day keeps the doctor away");
    }
}
