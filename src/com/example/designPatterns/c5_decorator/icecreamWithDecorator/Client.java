package com.example.designPatterns.c5_decorator.icecreamWithDecorator;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;
import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.cones.ChocolateCone;
import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.cones.VanillaCone;
import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.scoops.ButterscotchScoop;
import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.scoops.VanillaScoop;
import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.toppings.syrups.ChocolateSyrup;

public class Client {
    public static void main(String[] args) {
        ConeIcecream icecream = new ButterscotchScoop(
                                    new VanillaScoop(
                                            new ChocolateCone(
                                                    new ChocolateSyrup(
                                                            new VanillaCone()
                                                    )
                                            )
                                    )
                                );

        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());
    }
}
