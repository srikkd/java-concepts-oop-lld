package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models;

public class Pigeon extends Bird{
    @Override
    public void fly() {
        System.out.println("Pigeon Flying !!");
    }
    @Override
    public void eat() {
        System.out.println("Pigeon Eating");
    }
}
