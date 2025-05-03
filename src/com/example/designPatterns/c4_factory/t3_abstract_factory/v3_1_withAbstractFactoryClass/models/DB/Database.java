package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory.DBFactory;

public interface Database {
    void setUrl();
    void setHostname();
    void save();

    DBFactory createDBFactory();
}
