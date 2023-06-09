package com.example;

import com.example.student.*;

public class Example {
    public static void main(String[] args) {
        Student student = new Student("Jimmy Donaldson", 19);
        String introduction = student.introduce();

        System.out.println(introduction);
    }
}
