package com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Updater.Updater;

public interface Database {
    void setUrl();
    void setHostname();
    void save();

    Query createQuery();

    Transaction createTransaction();

    Updater createUpdater();
}
