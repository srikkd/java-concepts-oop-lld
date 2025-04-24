package com.example.oop.encapsulation.constructors;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        //default constructor
        Student stu = new Student();

        // custom constructor without any param, similar to default constructor
        StudentA stuA = new StudentA();
        StudentA stuA1 = new StudentA();

//        StudentB stuB = new StudentB(); // this will give error
        // custom constructor with params
        StudentB studentB1 = new StudentB("Naveen", 21, List.of("Nov 21"));
        StudentB studentB2 = new StudentB("Ria", 24, List.of("Dec 22"));

        // COPY-CONSTRUCTOR: custom constructor with another object of the same class as param
        StudentC studentC = new StudentC();
        StudentC studentC1 = new StudentC(studentC);

        // generally, copy-constructor accomplishes the function of shallow-copy
        // we can try to make deeper copies, but it is practically impossible to make an absolute deep copy
    }
}
