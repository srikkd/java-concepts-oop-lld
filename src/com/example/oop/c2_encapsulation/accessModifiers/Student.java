package com.example.oop.c2_encapsulation.accessModifiers;

public class Student {
    private int id;
    String name;
    protected String gender;
    public int age;
    public String batch;

    public void changeBatch(String newBatch){
        batch = newBatch;
        return ;
    }

    private void pauseCourse(int duration){
        batch = null;
        System.out.println("Paused the course !!");
        return;
    }

}
