package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.chips;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.Topping;

public class ChocoChips implements Topping {
    @Override
    public Integer getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }

}
