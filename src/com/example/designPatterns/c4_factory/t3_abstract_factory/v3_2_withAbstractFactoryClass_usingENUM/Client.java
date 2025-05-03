package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM;

public class Client {
    public static void main(String[] args) {
        UserServiceUsingENUM userServiceUsingENUM = new UserServiceUsingENUM(DBType.POSTGRESQL);

        userServiceUsingENUM.registerUser();
        userServiceUsingENUM.loginUser();

        userServiceUsingENUM.printTransaction();
        userServiceUsingENUM.printUpdater();
    }
}
