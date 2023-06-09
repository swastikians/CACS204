package oop.basics;


class Main {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 22;
        int semester = 6;

        Student student = new Student(name, age, semester);

        System.out.println(student.describe());
    }
}


class Student {
    public String name;
    public int semester;
    public int age;

    public Student(String name, int age, int semester) {
        this.name = name;
        this.age = age;
        this.semester = semester;
    }

    public String describe() {
        return "Hello, my name is " + name + " and I am " + age + " years old. I study in " + semester + " semester.";
    }
}
