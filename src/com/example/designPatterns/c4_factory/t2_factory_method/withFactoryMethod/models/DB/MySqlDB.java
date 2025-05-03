package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.DB;

import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.Query;

public class MySqlDB implements Database {
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
    public Query createQuery() {
        return new MySqlQuery();
    }
}
