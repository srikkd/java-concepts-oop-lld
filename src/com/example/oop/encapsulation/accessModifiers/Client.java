package com.example.oop.encapsulation.accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student naveen = new Student();

//        naveen.id = 1;  // this doesn't work because it is private
        naveen.name = "Naveen Kumar";
    }
}
