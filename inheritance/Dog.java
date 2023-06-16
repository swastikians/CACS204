package inheritance;

public class Dog extends Animal {
    public Dog() {
        super("Lucy");
    }

    public void makeNoise() {
        System.out.println("woof woof");
    }

    public void eat() {
        System.out.println("Eating bread...");
    }

    public void work() {
        super.eat();
        this.makeNoise();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Name of the dog is " + dog.name);
        dog.work();
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void makeNoise() {
        System.out.println("animal says hello");
    }

    public void work() {
        this.eat();
        this.makeNoise();
    }
}