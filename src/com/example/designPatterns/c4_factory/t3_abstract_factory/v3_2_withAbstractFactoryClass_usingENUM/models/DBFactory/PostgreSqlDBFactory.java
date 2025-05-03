package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Query.PostgreSqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Transaction.PostgreSqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Updater.PostgreSqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Updater.Updater;

public class PostgreSqlDBFactory implements DBFactory {
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
