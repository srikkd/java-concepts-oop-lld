package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Olive implements Pizza {
    Pizza pizza;
    public Olive(Pizza p){
        this.pizza = p;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost()+20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
