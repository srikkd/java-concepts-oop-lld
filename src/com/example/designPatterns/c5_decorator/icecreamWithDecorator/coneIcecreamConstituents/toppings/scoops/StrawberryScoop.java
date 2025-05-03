package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.scoops;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class StrawberryScoop implements ConeIcecream {
    ConeIcecream coneIcecream;

    public StrawberryScoop(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        return coneIcecream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
