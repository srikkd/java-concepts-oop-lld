package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.MongoDBFactory;

public class MongoDB implements Database {
    @Override
    public void setUrl() {

    }

    @Override
    public void setHostname() {

    }

    @Override
    public void save() {

    }

    @Override
    public DBFactory createDBFactory() {
        return new MongoDBFactory();
    }
}
