package com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Query;

public class PostgreSqlQuery implements Query {
    @Override
    public void register() {
        System.out.println("registered through PostgreSqlQuery");
    }

    @Override
    public void login() {
        System.out.println("logged-in through PostgreSqlQuery");
    }
}
