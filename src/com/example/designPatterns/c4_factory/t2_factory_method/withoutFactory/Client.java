package com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory;

import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.MongoDB;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService(new MongoDB());

        userService.registerUser();
        userService.loginUser();
    }
}
