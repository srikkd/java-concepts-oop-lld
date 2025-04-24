package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v1_5;

public abstract class Bird {
    private String name;
    private String color;
    private Double weight;
    private String type;

    public Bird() {
    }

    public Bird(String birdType) {
        this.type = birdType;
    }

    public void eat() {
    }
}
