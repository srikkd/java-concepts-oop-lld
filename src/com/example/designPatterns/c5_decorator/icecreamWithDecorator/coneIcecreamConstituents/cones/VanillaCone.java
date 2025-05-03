package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.cones;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class VanillaCone implements ConeIcecream {
    ConeIcecream coneIcecream;

    public VanillaCone(){}
    public VanillaCone(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        if(coneIcecream != null){
            return coneIcecream.getCost() + 25;
        }
        return 25;
    }

    @Override
    public String getDescription() {
        if(coneIcecream != null){
            return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
        }
        return this.getClass().getSimpleName();
    }
}
