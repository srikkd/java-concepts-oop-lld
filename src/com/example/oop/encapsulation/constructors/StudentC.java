package com.example.oop.encapsulation.constructors;

public class StudentC {
    int id;
    String name;
    int age;
    String gender = "Gender Not specified";

    String batch;

    StudentC(){}

    StudentC(StudentC otherObject){
        this.id = otherObject.id;
        this.name = otherObject.name;
        this.age = otherObject.age;
        this.gender = otherObject.gender;
        this.batch = otherObject.batch;
    }
}
