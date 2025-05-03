package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow flying !!!");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }
}
