package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = List.of(new Sparrow(), new Crow(), new Penguin());

//        List<Flyable> flyingBirds = List.of(new Sparrow(), new Penguin());// Compiler gives error, so interface works
        List<Flyable> flyingBirds = List.of(new Sparrow(), new Crow());
        for(Flyable fb: flyingBirds){
            fb.fly();
        }
    }
}
