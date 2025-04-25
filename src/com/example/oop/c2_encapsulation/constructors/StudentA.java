package com.example.oop.c2_encapsulation.constructors;

public class StudentA {
    int id;
    String name;
    int age;
    String gender;

    StudentA(){
        name = "Default Name";
        System.out.println("Student1 object has been created with custom constructor, similar to default constructor!!");
    }
}
