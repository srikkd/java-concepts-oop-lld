package com.example.designPatterns.c3_prototype_registry.v1_using_clone;

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

    //clone method
    public Student clone(){
        Student s = new Student();
        s.name = this.name;
        s.age = this.age;

        return s;
    }
}
