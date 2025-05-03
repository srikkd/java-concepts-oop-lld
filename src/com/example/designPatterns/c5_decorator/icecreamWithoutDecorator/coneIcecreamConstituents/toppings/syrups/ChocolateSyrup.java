package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.syrups;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.Topping;

public class ChocolateSyrup implements Topping {
    @Override
    public Integer getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
