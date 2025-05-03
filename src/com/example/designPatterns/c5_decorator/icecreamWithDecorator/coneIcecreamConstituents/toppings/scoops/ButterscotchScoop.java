package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.scoops;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class ButterscotchScoop implements ConeIcecream {
    ConeIcecream coneIcecream;

    public ButterscotchScoop(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        return coneIcecream.getCost() + 25;
    }

    @Override
    public String getDescription() {
        return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
