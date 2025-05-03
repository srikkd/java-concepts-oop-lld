package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.DB;

import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.MongoQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.Query;

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
    public Query createQuery() {
        return new MongoQuery();
    }
}
