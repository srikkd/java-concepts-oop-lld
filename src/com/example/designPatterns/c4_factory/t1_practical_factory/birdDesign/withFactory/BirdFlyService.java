package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.withFactory;

import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.*;

public class BirdFlyService {
    Bird b;

    public BirdFlyService(BirdType birdType){
        b = BirdFactory.createBirdByBirdType(birdType);
    }

    public void makeBirdFly(){
        b.fly();
    }
}
