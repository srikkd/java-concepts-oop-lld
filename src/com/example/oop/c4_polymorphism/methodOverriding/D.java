package com.example.oop.c4_polymorphism.methodOverriding;

public class D extends C{
    public void greet(){
        System.out.println("Namaste");
        super.greet();
    }
}
