package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.withoutFactory;

import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.*;

public class BirdFlyService {
    Bird b;

    public BirdFlyService(BirdType birdType){

        b = new Sparrow();  // default initialization to avoid Null-pointer exception
        if(birdType == BirdType.SPARROW){
            b = new Sparrow();
        } else if (birdType == BirdType.PIGEON) {
            b = new Pigeon();
        } else if (birdType == BirdType.CROW) {
            b = new Crow();
        }
    }

    public void makeBirdFly(){
        b.fly();
    }
}
