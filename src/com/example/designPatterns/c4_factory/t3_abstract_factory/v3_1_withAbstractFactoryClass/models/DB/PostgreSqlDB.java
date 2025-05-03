package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory.PostgreSqlDBFactory;

public class PostgreSqlDB implements Database {
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
        return new PostgreSqlDBFactory();
    }
}
