package com.example.student;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + this.name + " and I am " + this.age + " years old.";
    }
}
