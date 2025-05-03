package com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DBFactory;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Transaction.MySqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Updater.MySqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Updater.Updater;

public class MySqlDBFactory implements DBFactory {

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
