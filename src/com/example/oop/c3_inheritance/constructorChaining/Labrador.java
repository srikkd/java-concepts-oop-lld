package com.example.oop.c3_inheritance.constructorChaining;

public class Labrador extends Dog {
    // 1st level of testing with no-param constructor in parent: keep it default, make it private etc.
//    Labrador(){
//        System.out.println("I am Labrador Class constructor with no params !!");
//    }

    //2nd level of testing by trying other custom constructors in parent, using super keyword
    Labrador(){
        super("reewgtre");
        System.out.println("I am Labrador Class constructor with no params !!");
    }
}
