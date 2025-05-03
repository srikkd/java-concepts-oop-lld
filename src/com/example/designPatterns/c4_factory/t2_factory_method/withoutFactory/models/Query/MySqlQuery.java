package com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.Query;

public class MySqlQuery implements Query{
    @Override
    public void register() {
        System.out.println("registered through MySqlQuery");
    }

    @Override
    public void login() {
        System.out.println("logged-in through MySqlQuery");
    }
}
