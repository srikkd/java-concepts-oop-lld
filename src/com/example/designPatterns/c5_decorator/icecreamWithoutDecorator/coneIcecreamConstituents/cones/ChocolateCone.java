package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones;

public class ChocolateCone implements Cone {
    @Override
    public Integer getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
