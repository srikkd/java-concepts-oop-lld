package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query;

public class MongoQuery implements Query {
    @Override
    public void register() {
        System.out.println("registered by MongoQuery");
    }

    @Override
    public void login() {
        System.out.println("logged-in through MongoQuery");
    }
}
