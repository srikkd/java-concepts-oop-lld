package com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Updater;

public class MySqlUpdater implements Updater {
    public void printUpdater() {
        System.out.println(getClass());
    }
}
