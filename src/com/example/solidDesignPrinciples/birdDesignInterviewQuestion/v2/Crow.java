package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2;

public class Crow extends Bird implements Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("Crow flies !!");
    }

    @Override
    public void walk() {
        System.out.println("Crow Walks !!");
    }
}
