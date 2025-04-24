package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2;

public class Sparrow extends Bird implements Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("Sparrow flies !!");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow Walks !!");
    }
}
