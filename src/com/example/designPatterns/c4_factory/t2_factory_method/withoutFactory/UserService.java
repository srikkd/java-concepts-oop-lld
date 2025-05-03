package com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory;

import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.Database;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.MongoDB;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.MySqlDB;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.PostgreSqlDB;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.Query.MongoQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.Query.PostgreSqlQuery;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.Query.Query;

public class UserService {
    Database db;

    public UserService(Database database){
        this.db = database;
    }

    public void registerUser(){
        Query q = new MySqlQuery();
        if( db instanceof MySqlDB){
            q = new MySqlQuery();
        } else if( db instanceof PostgreSqlDB){
            q = new PostgreSqlQuery();
        } else if( db instanceof MongoDB){
            q = new MongoQuery();
        }

        q.register();
    }

    public void loginUser(){
        Query q = new MySqlQuery();
        if( db instanceof MySqlDB){
            q = new MySqlQuery();
        } else if( db instanceof PostgreSqlDB){
            q = new PostgreSqlQuery();
        } else if( db instanceof MongoDB){
            q = new MongoQuery();
        }

        q.login();
    }
}
