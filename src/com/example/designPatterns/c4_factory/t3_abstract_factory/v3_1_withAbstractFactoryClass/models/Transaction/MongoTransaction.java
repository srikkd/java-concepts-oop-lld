package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Transaction;

public class MongoTransaction implements Transaction {
    @Override
    public void printTransaction() {
        System.out.println(getClass());
    }
}
