package com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB.Database;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query.Query;

public class UserService {
    Database db;

    public UserService(Database database){
        this.db = database;
    }

    public void registerUser(){
        Query q = DBFactory.createQuery(db);
        // removed if-else logic from here: just ask the respective DBFactory for its specific Query
        q.register();
    }

    public void loginUser(){
        Query q = DBFactory.createQuery(db);
        // removed if-else logic from here: just ask the respective DBFactory for its specific
        q.login();
    }

    public void printTransaction() {
        DBFactory.createTransaction(db).printTransaction();
    }

    public void printUpdater() {
        DBFactory.createUpdater(db).printUpdater();
    }
}
