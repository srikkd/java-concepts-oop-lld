package com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query;

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
