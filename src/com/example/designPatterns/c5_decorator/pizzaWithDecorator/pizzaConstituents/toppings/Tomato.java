package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Tomato implements Pizza {
    Pizza pizza;
    public Tomato(Pizza p){
        this.pizza = p;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
