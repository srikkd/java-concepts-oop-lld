package com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.DB.Database;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v0_withManyFactoryMethodsInDBClass.models.Query.Query;

public class UserService {
    Database db;

    public UserService(Database database){
        this.db = database;
    }

    public void registerUser(){
        Query q = db.createQuery();
        // removed if-else logic from here: just ask the respective database for its specific query
        q.register();
    }

    public void loginUser(){
        Query q = db.createQuery();
        // removed if-else logic from here: just ask the respective database for its specific query
        q.login();
    }

    public void printTransaction() {
        db.createTransaction().printTransaction();
    }

    public void printUpdater() {
        db.createUpdater().printUpdater();
    }
}
