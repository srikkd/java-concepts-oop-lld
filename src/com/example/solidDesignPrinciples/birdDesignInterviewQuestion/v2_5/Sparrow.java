package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2_5;

import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v2_5.FlyingBehaviorAux.FlyWay1;

public class Sparrow extends Bird implements Flyable {

    FlyWay1 flyWay1 = new FlyWay1();

    @Override
    public void fly() {
        flyWay1.makeFly();
    }
}
