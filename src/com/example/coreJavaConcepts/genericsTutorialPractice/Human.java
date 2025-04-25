package com.example.coreJavaConcepts.genericsTutorialPractice;

public class Human extends Animal{
    int height = 6;

    @Override
    public void printTest() {
//        super.printTest();
        System.out.println("I am a Human object, child of Animal class");
        System.out.printf(String.valueOf(getClass()));
    }

    public void humanChildClassSpecificMethod(){
        System.out.printf("testing child class method !!!");
    }
}
