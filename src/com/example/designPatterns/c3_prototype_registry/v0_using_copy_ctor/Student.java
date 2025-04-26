package com.example.designPatterns.c3_prototype_registry.v0_using_copy_ctor;

public class Student {
    public String name;
    private Integer age;

    public Student(){}
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    //normal copy-constructor
    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
    }
}
