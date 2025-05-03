package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.chips;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class ChocoChips implements ConeIcecream {
    ConeIcecream coneIcecream;

    public ChocoChips(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        return coneIcecream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
    }

}
