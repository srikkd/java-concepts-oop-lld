package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Transaction;

public class MongoTransaction implements Transaction {
    @Override
    public void printTransaction() {
        System.out.println(getClass());
    }
}
