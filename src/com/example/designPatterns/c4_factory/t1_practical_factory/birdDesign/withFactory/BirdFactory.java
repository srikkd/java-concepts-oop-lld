package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.withFactory;

import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.*;
import com.example.oop.c4_polymorphism.methodOverriding.B;

// often it has usecases with ENUM, to create appropriate child object in the
public class BirdFactory {

    public static Bird createBirdByBirdType(BirdType birdType){
//        if(birdType == BirdType.SPARROW){
//            return new Sparrow();
//        } else if (birdType == BirdType.PIGEON) {
//            return new Pigeon();
//        } else if (birdType == BirdType.CROW) {
//            return new Crow();
//        }
//
//        return new Sparrow(); // default initialization to avoid null-pointer exception

        return switch (birdType){
            case SPARROW -> new Sparrow();
            case PIGEON -> new Pigeon();
            case CROW -> new Crow();
            case null, default -> new Sparrow(); // default initialization to avoid null-pointer exception
        };
    }
}
