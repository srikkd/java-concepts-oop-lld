package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models;

public class Crow extends Bird{
    @Override
    public void fly() {
        System.out.println("Crow Flying !!");
    }

    @Override
    public void eat() {
        System.out.println("Crow Eating");
    }
}
