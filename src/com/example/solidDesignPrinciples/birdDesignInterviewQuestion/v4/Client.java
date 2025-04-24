package com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v4;

import com.example.solidDesignPrinciples.birdDesignInterviewQuestion.v4.FlyingBehaviorAux.FlyWay2;

public class Client {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow( new FlyWay2() );
        // flying Behavior being passed at runtime
        // dependency is being injected at runtime:
        // so, even if flying behavior changes for some bird, it will not affect that bird Class's code

        sparrow.fly();
    }
}
