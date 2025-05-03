package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.basePizzas;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public Integer getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
