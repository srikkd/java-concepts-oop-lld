package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod;

import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.DB.MySqlDB;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDB());

        userService.registerUser();
        userService.loginUser();
    }
}
