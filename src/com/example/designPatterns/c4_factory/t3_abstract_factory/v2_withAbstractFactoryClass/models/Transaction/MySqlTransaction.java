package com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Transaction;

public class MySqlTransaction implements Transaction {
    @Override
    public void printTransaction() {
        System.out.println(getClass());
    }
}
