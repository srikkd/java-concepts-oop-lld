package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DB.Database;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_1_withAbstractFactoryClass.models.Query.Query;

public class UserService {
    Database db;

    public UserService(Database database){
        this.db = database;
    }

    public void registerUser(){
        // removed if-else logic from here: just ask the respective database for its specific DBFactory
        DBFactory dbFactory = db.createDBFactory();

        Query q = dbFactory.createQuery();
        q.register();
    }

    public void loginUser(){
        // removed if-else logic from here: just ask the respective database for its specific DBFactory
        Query q = db.createDBFactory().createQuery();

        q.login();
    }

    public void printTransaction() {
        db.createDBFactory().createTransaction().printTransaction();
    }

    public void printUpdater() {
        db.createDBFactory().createUpdater().printUpdater();
    }
}
