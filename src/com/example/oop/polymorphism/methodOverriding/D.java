package com.example.oop.polymorphism.methodOverriding;

public class D extends C{
    public void greet(){
        System.out.println("Namaste");
        super.greet();
    }
}
