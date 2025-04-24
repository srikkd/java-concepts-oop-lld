package com.example.oop.inheritance.sizeOfChildClass;

public class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        // is there any way to check size of Dog object or see the attributes present in the Dog object:
        // put a breakpoint after object-creation and check thr debugger

//        d.a = 32;   // it gives CT error although 'a' variable is present in the newly created Dog object:
        // private attributes/methods of parent are present but not accessible in child class object

    }
}
