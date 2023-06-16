package inheritance;

class Programmer extends Employee {
    int bonus = 100_000;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        System.out.println("Programmer's salary is " + programmer.salary);
        System.out.println("Programmer's bonus is " + programmer.bonus);
    }
}

class Employee {
    float salary = 70_000;
}