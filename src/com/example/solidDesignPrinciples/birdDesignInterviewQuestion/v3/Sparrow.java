package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v3;

import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v3.FlyingBehaviorAux.FlyWay1;
import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v3.FlyingBehaviorAux.FlyingBehavior;

public class Sparrow extends Bird implements Flyable {

    FlyingBehavior fb = new FlyWay1();

    @Override
    public void fly() {
        fb.makeFly();
    }
}
