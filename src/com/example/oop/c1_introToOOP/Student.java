package com.example.oop.c1_introToOOP;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String batch;

    void changeBatch(String newBatch){
        batch = newBatch;
        return ;
    }

    void pauseCourse(int duration){
        batch = null;
        System.out.println("Paused the course !!");
        return;
    }

}
