package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.syrups;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class ChocolateSyrup implements ConeIcecream {
    ConeIcecream coneIcecream;

    public ChocolateSyrup(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        return coneIcecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
