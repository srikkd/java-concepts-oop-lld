package com.example.designPatterns.c5_decorator.pizzaWithDecorator;

import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.Pizza;
import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.basePizzas.BBQChicken;
import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.basePizzas.Farmhouse;
import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings.Cheese;
import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings.Paneer;
import com.example.designPatterns.c5_decorator.pizzaWithDecorator.pizzaConstituents.toppings.Tomato;

public class Client {
    public static void main(String[] args) {
        Pizza p = new Cheese( new Farmhouse() );

        System.out.println(p.getCost());
        System.out.println(p.getDescription());

        Pizza p1 = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p1.getCost());
        System.out.println(p1.getDescription());
    }
}
