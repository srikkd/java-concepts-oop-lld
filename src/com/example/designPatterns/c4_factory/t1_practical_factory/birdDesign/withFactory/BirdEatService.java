package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.withFactory;

import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.Bird;
import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.BirdType;

public class BirdEatService {
    Bird b;

    public BirdEatService(BirdType birdType){
        b = BirdFactory.createBirdByBirdType(birdType);
    }

    public void makeBirdEat(){
        b.eat();
    }
}
