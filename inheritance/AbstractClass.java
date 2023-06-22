package inheritance;

public class AbstractClass {
    public static void main(String[] args) {
        Apple apple = new Apple();

        apple.eat();
    }
}

abstract class Fruit {
    public abstract void eat();
}

class Apple extends Fruit {
    public void eat() {
        System.out.println("An apple a day keeps the doctor away...");
    }
}