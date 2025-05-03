package com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Updater;

public class PostgreSqlUpdater implements Updater {
    public void printUpdater() {
        System.out.println(getClass());
    }
}
