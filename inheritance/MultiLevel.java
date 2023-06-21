package inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        BabyDog doggo = new BabyDog();

        doggo.eat();
        doggo.bark();
        doggo.weep();
    }
}

class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof...");
    }
}

class BabyDog extends Dog {
    public void weep() {
        System.out.println("weeping...");
    }
}