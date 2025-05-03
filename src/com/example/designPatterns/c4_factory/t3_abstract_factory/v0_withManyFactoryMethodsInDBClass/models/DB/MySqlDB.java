package com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction.MySqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Updater.MySqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Updater.Updater;

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

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new MySqlUpdater();
    }
}
