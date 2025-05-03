package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Updater.Updater;

public interface DBFactory {
    Query createQuery();

    Transaction createTransaction();

    Updater createUpdater();
}
