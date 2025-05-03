package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones;

public class VanillaCone implements Cone {
    @Override
    public Integer getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
