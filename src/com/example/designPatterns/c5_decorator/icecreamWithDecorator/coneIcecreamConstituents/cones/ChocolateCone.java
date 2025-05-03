package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.cones;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class ChocolateCone implements ConeIcecream {
    ConeIcecream coneIcecream;

    public ChocolateCone(){}
    public ChocolateCone(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        if(coneIcecream != null){
            return coneIcecream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(coneIcecream != null){
            return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
        }
        return this.getClass().getSimpleName();
    }
}
