package com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.DB;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.PostgreSqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction.PostgreSqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Updater.PostgreSqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Updater.Updater;

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
    public Query createQuery() {
        return new PostgreSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgreSqlTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new PostgreSqlUpdater();
    }
}
