package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v1;

public class Client {
    public static void main(String[] args) {
        Bird bird = new Sparrow();

        bird.fly(); // here, sparrow's fly() method will run at runtime, although bird is of Data-type Bird: polym
        // for type-checking, compiler will check about Bird class having fly method:
        // try removing fly() method from Bird class and compiler will give error
        // compiler checks for Bird's having fly method,
        // but runtime executes object's impl as per which object is created
    }
}
