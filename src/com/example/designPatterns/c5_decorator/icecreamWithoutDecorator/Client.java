package com.example.designPatterns.c5_decorator.icecreamWithoutDecorator;

import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones.ChocolateCone;
import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.cones.VanillaCone;
import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.scoops.ButterscotchScoop;
import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.scoops.VanillaScoop;
import com.example.designPatterns.c5_decorator.icecreamWithoutDecorator.coneIcecreamConstituents.toppings.syrups.ChocolateSyrup;

public class Client {
    public static void main(String[] args) {
        ConeIcecream icecream = new ConeIcecream();

        icecream.addCone( new ChocolateCone() );
        icecream.addTopping( new ChocolateSyrup() );
//        icecream.addTopping( new VanillaCone() ); // gives error
        icecream.addCone( new VanillaCone() );
        icecream.addTopping( new VanillaScoop() );
        icecream.addTopping( new ButterscotchScoop() );

        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());
        // as such this solution/design works,
        // but here, we can't maintain the order of adding the cones and toppings:
        // description is printed first for all cones and then, for all toppings:
        // we don't know which topping was added before vanilla cone

        // decorator design pattern can solve this issue:
        // If we have a scenario where we add properties/features to a base entity at runtime
        // where the final output depends on the output of base entity
        // consider using decorator design
    }
}
