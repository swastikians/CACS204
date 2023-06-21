package inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        Human human = new Human();
        human.greet();

        System.out.println();

        Nepali nepaliPerson = new Nepali();
        nepaliPerson.greet();

        System.out.println();
        
        American amrikan = new American();
        amrikan.greet();
    }   
}

class Human {
    public void greet() {
        System.out.println("Human: Greetings...");
    }
}

class Nepali {
    public void greet() {
        System.out.println("Nepali: Namaste!");
    }
}

class American {
    public void greet() {
        System.out.println("American: Yo what's up bro?");
    }
}