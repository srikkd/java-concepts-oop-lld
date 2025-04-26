package com.example.oop.c2_encapsulation.accessModifiers;

public class Student {
    private int id;
    String name;
    protected String gender;
    public int age;
    public String batch;

    public Student clone(){
        Student copyStudentObject = new Student();
        copyStudentObject.id = this.id; // private can be accessed thr new object in the same class
        copyStudentObject.name = this.name;
        copyStudentObject.gender = this.gender;
        copyStudentObject.age = this.age;
        copyStudentObject.batch = batch;

        return copyStudentObject;
    }

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
