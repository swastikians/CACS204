package interface_example;

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();
    }
}

interface Wheels {
    int getWheelCount();
}

interface Vehicle extends Wheels {
    void run();
}

class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike: Running 98 miles per hour");
    }

    public int getWheelCount() {
        return 2;
    }
}

class Car implements Vehicle {
    public void run() {
        System.out.println("Car: Running 37 miles per hour");
    }

    public int getWheelCount() {
        return 4;
    }
}

