package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2;

public class Penguin extends Bird implements Walkable{
    @Override
    public void walk() {
        System.out.println("Penguin Walks !!");
    }
}
