package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Query.MongoQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Transaction.MongoTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Updater.MongoUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Updater.Updater;

public class MongoDBFactory implements DBFactory {
    @Override
    public Query createQuery() {
        return new MongoQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MongoTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new MongoUpdater();
    }
}
