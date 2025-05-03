package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones.Cone;
import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConeIcecream {
//    private List<Cone> cones;   // gives error as not initialized
    private List<Cone> cones = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();

    public void addCone(Cone c){
        cones.add(c);
    }
    public void addTopping(Topping t){
        toppings.add(t);
    }

    public Integer getCost(){

//        return this.toppings.stream()
//                .map(Topping::getCost)
//                .reduce(cone.getCost(), Integer::sum);

        int conesCost = cones.stream().mapToInt( cone -> cone.getCost() ).sum();
        int toppingsCost = toppings.stream().mapToInt( topping -> topping.getCost() ).sum();
        // .sum() doesn't work with Stream<Integer>, but with Stream<int>
        return conesCost + toppingsCost;
    }

    public String getDescription(){
        String conesDesc = cones.stream().map(Cone::getDescription).collect(Collectors.joining("\n"));
        String toppingsDesc = toppings.stream().map(Topping::getDescription).collect(Collectors.joining("\n"));

        return conesDesc + "\n" + toppingsDesc;
    }
}
