package com.example.oop.encapsulation.accessModifierHelper;

import oop.encapsulation.accessModifiers.Student;

public class Client extends Student {

    public static void main(String[] args) {
        Student s1 = new Student(); // only public attr will be visible thr s1
        s1.age = 31;
        s1.batch = "hello";

//        s1.gender = "Male"; // it gives error
        // because accessing protected attribute through the separate object of parent class
        // and not directly

//        gender = "Female";    // why this is not working
    }
}
