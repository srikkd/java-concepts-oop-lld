package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DB.MySqlDB;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDB());

        userService.registerUser();
        userService.loginUser();

        userService.printTransaction();
        userService.printUpdater();
    }
}
