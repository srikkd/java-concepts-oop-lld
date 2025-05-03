package com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.cones;

import com.example.designPatterns.c5_decorator.icecreamWithDecorator.coneIcecreamConstituents.ConeIcecream;

public class OrangeCone implements ConeIcecream {
    ConeIcecream coneIcecream;

    public OrangeCone(){}
    public OrangeCone(ConeIcecream icecream){
        this.coneIcecream = icecream;
    }

    @Override
    public Integer getCost() {
        if(coneIcecream != null){
            return coneIcecream.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if(coneIcecream != null){
            return coneIcecream.getDescription() + " + " + this.getClass().getSimpleName();
        }
        return this.getClass().getSimpleName();
    }

    public Integer getVitaminCQty(){
        return 34;
    }
}
