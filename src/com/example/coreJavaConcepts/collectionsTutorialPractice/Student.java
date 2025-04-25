package com.example.coreJavaConcepts.collectionsTutorialPractice;

public class Student implements Comparable<Student>{
    int id;
    int age;
    String name;
    double percentage;

    public Student(int id, int age, String name, int percentage) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        if(this.name.equals(other.name)){
            return 0;
        }

        if(this.name.compareTo(other.name) < 0){
            return -1;
        }
        return 1;
    }


}
