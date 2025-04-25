package com.example.coreJavaConcepts.genericsTutorialPractice;

public class Animal {
    String name = "hello";
    int age = 22;
    int weight = 70;

    public void printTest(){
        System.out.println("I am a Animal object");
        System.out.println(String.valueOf(getClass()));
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", ObjectType=" + String.valueOf(getClass()) +
                '}';
    }
}
