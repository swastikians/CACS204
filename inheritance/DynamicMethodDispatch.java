package inheritance;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Tech instance;

        instance = new Apple();
        instance.display();

        instance = new Google();
        instance.display();

        instance = new Microsoft();
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