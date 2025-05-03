package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Paneer implements Pizza {
    Pizza pizza;
    public Paneer(Pizza p){
        this.pizza = p;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost()+60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
