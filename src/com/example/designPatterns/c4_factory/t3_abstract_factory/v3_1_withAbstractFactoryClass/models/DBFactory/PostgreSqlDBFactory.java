package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Query.PostgreSqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Transaction.PostgreSqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Updater.PostgreSqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Updater.Updater;

public class PostgreSqlDBFactory implements DBFactory{
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
