package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v0;

import java.util.Objects;

public class Bird {
    private String name;
    private String color;
    private Double weight;
    private String type;

    public Bird(){}
    public Bird(String birdType){
        type = birdType;
    }
    public void eat(){}

    public void fly(){
        if( Objects.equals(type, "Sparrow") ){
            System.out.println("Not too high");
        }
        else if( Objects.equals(type, "Crow") ){
            System.out.println("Not too high");
        }
        else if( Objects.equals(type, "Eagle") ){
            System.out.println("too high");
        }
        else if( Objects.equals(type, "Parrot") ){
            System.out.println("beautiful color");
        }
        else if( Objects.equals(type, "Pigeon") ){
            System.out.println("Beautiful Flight");
        }

    }

    public void walk(){}
}
