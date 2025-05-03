package com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.withoutFactory;

import com.example.designPatterns.c4_factory.t1_practical_factory.birdDesign.models.BirdType;

public class Client {
    public static void main(String[] args) {
        BirdFlyService birdFlyService = new BirdFlyService(BirdType.SPARROW);
        birdFlyService.makeBirdFly();

        BirdEatService birdEatService = new BirdEatService(BirdType.PIGEON);
        birdEatService.makeBirdEat();
    }
}
