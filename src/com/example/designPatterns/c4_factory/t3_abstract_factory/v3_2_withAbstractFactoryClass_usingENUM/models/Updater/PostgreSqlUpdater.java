package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Updater;

public class PostgreSqlUpdater implements Updater {
    public void printUpdater() {
        System.out.println(getClass());
    }
}
