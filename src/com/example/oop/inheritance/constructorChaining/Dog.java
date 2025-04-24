package com.example.oop.inheritance.constructorChaining;

public class Dog extends Animal{
    // 1st level of testing with no-param constructor: keep it default, make it private etc.
//    Dog(){
//        System.out.println("I am in Dog Class constructor with no params");
//    }

    //2nd level of testing by trying other custom constructors in parent, using super keyword
    Dog(String word){
        System.out.println("I am in a custom constructor of Dog Class: " + word);
    }

    Dog(String word, String word2){
        System.out.println("I am in a custom constructor of Dog Class: " + word + word2);
    }
}
