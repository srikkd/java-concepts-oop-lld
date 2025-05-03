package com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass;

import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.MongoDB;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.MySqlDB;
import com.example.designPatterns.c4_factory.t2_factory_method.withoutFactory.models.DB.PostgreSqlDB;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DB.Database;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DBFactory.MongoDBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DBFactory.MySqlDBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.DBFactory.PostgreSqlDBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v2_withAbstractFactoryClass.models.Query.Query;

public class UserService {
    Database db;

    public UserService(Database database){
        this.db = database;
    }

    public void registerUser(){
        // below if-else violates SRP, OCP and DRY (Code-Duplication): create factory method for this
        DBFactory dbFactory = new MySqlDBFactory();
        if( db instanceof MySqlDB){
            dbFactory = new MySqlDBFactory();
        } else if( db instanceof PostgreSqlDB){
            dbFactory = new PostgreSqlDBFactory();
        } else if( db instanceof MongoDB){
            dbFactory = new MongoDBFactory();
        }

        Query q = dbFactory.createQuery();
        q.register();
    }

    public void loginUser(){
        DBFactory dbFactory = new MySqlDBFactory();
        if( db instanceof MySqlDB){
            dbFactory = new MySqlDBFactory();
        } else if( db instanceof PostgreSqlDB){
            dbFactory = new PostgreSqlDBFactory();
        } else if( db instanceof MongoDB){
            dbFactory = new MongoDBFactory();
        }
        Query q = dbFactory.createQuery();
        q.login();
    }

    public void printTransaction() {
        DBFactory dbFactory = new MySqlDBFactory();
        if( db instanceof MySqlDB){
            dbFactory = new MySqlDBFactory();
        } else if( db instanceof PostgreSqlDB){
            dbFactory = new PostgreSqlDBFactory();
        } else if( db instanceof MongoDB){
            dbFactory = new MongoDBFactory();
        }

        dbFactory.createTransaction().printTransaction();
    }

    public void printUpdater() {
        DBFactory dbFactory = new MySqlDBFactory();
        if( db instanceof MySqlDB){
            dbFactory = new MySqlDBFactory();
        } else if( db instanceof PostgreSqlDB){
            dbFactory = new PostgreSqlDBFactory();
        } else if( db instanceof MongoDB){
            dbFactory = new MongoDBFactory();
        }

        dbFactory.createUpdater().printUpdater();
    }
}
