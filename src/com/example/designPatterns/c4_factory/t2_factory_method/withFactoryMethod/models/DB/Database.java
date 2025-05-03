package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.DB;

import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.Query;

public interface Database {
    void setUrl();
    void setHostname();
    void save();

    Query createQuery();
}
