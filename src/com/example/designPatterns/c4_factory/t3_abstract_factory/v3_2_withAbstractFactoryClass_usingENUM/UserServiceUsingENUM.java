package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.Query.Query;

public class UserServiceUsingENUM {
    DBType dbType;

    public UserServiceUsingENUM(DBType dbType){
        this.dbType = dbType;
    }

    public void registerUser(){
        // removed if-else logic from here: just ask the respective database for its specific DBFactory
        DBFactory dbFactory = DBFactoryFactory.createDBFactoryUsingENUM(dbType);

        Query q = dbFactory.createQuery();
        q.register();
    }

    public void loginUser(){
        // removed if-else logic from here: just ask the respective database for its specific DBFactory
        Query q = DBFactoryFactory.createDBFactoryUsingENUM(dbType).createQuery();

        q.login();
    }

    public void printTransaction() {
        DBFactoryFactory.createDBFactoryUsingENUM(dbType).createTransaction().printTransaction();
    }

    public void printUpdater() {
        DBFactoryFactory.createDBFactoryUsingENUM(dbType).createUpdater().printUpdater();
    }
}
