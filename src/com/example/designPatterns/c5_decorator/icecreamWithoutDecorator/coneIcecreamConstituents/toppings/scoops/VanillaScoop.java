package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.scoops;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.Topping;

public class VanillaScoop implements Topping {
    @Override
    public Integer getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
