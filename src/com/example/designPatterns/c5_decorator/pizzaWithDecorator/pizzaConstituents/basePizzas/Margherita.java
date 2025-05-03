package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.basePizzas;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Margherita implements Pizza {
    @Override
    public Integer getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return this.getClass().getSimpleName();
    }
}
