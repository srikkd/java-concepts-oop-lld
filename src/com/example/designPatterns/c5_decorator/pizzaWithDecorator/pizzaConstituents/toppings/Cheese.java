package com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;

public class Cheese implements Pizza{
    Pizza pizza;
    public Cheese(Pizza p){
        this.pizza = p;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost()+80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + " + this.getClass().getSimpleName();
    }
}
