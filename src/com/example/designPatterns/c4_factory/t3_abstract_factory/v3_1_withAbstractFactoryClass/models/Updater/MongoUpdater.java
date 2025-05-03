package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Updater;

public class MongoUpdater implements Updater {
    public void printUpdater() {
        System.out.println(getClass());
    }
}
