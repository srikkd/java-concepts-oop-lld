package com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB;

public interface Database {
    void setUrl();
    void setHostname();
    void save();
}
