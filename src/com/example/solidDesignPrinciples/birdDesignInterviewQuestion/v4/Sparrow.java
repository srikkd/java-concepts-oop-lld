package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v4;

import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v4.FlyingBehaviorAux.FlyWay1;
import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v4.FlyingBehaviorAux.FlyingBehavior;

public class Sparrow extends Bird implements Flyable {

    private FlyingBehavior fb;

//    public Sparrow(){}    // this constructor gives RT error if used to instantiate Sparrow: because fb is null there
    public Sparrow(FlyingBehavior flyingBehavior){
        this.fb = flyingBehavior;
    }

    @Override
    public void fly() {
        fb.makeFly();
    }
}
