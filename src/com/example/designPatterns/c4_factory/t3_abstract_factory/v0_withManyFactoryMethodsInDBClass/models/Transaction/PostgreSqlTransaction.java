package com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction;

public class PostgreSqlTransaction implements Transaction{
    @Override
    public void printTransaction() {
        System.out.println(getClass());
    }
}
