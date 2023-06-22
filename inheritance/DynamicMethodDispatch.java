package inheritance;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Google google = new Google();
        Microsoft microsoft = new Microsoft();

        Tech instance;

        instance = apple;
        instance.display();

        instance = google;
        instance.display();

        instance = microsoft;
        instance.display();
    }
}

class Tech {
    public void display() {
        System.out.println("Inside Tech");
    }
}

class Apple extends Tech {
    public void display() {
        System.out.println("Inside Apple");
    }
}

class Google extends Tech {
    public void display() {
        System.out.println("Inside Google");
    }
}

class Microsoft extends Tech {
    public void display() {
        System.out.println("Inside Microsoft");
    }
}