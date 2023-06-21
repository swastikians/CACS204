package inheritance;

public class Hierarchial {
    public static void main(String[] args) {
        Cat thomas = new Cat();
        thomas.eat();
        thomas.meow();

        Dog spike = new Dog();
        spike.eat();
        spike.bark();
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("woof...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("meow...");
    }
}

class Animal {
    public void eat() {
        System.out.println("Eating deez nuts...");
    }
}