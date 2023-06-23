package inheritance;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("◼︎");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("▲");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("◉");
    }
}

abstract class Shape {
    abstract void draw();
}