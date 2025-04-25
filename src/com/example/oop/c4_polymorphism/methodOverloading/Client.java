package com.example.oop.c4_polymorphism.methodOverloading;

public class Client {
    public static void main(String[] args) {
        User u = new User();

        u.changePassword(3);
        u.changePassword("Hello");
        int a = u.changePassword();
    }
}
