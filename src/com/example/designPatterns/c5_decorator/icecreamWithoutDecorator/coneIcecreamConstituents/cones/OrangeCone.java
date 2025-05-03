package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones;


public class OrangeCone implements Cone {
    @Override
    public Integer getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
