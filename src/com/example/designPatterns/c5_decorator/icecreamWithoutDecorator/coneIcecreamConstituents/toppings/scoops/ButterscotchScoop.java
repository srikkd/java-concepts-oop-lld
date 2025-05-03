package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.scoops;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.Topping;

public class ButterscotchScoop implements Topping {
    @Override
    public Integer getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
