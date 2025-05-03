package com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod;

import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.DB.Database;
import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withFactoryMethod.models.Query.Query;

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
}
