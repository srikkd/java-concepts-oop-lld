package com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass;


import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB.Database;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB.MongoDB;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB.MySqlDB;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.DB.PostgreSqlDB;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query.MongoQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query.MySqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query.PostgreSqlQuery;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Query.Query;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Transaction.MongoTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Transaction.MySqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Transaction.PostgreSqlTransaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Transaction.Transaction;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Updater.MongoUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Updater.MySqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Updater.PostgreSqlUpdater;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v1_withSeparateFactoryConcreteClass.models.Updater.Updater;

public class DBFactory {

    public static Query createQuery(Database db){
        if( db instanceof MySqlDB){
            return new MySqlQuery();
        } else if( db instanceof PostgreSqlDB){
            return new PostgreSqlQuery();
        } else if( db instanceof MongoDB){
            return new MongoQuery();
        }

        return new MySqlQuery();
    }

    public static Transaction createTransaction(Database db){
        if( db instanceof MySqlDB){
            return new MySqlTransaction();
        } else if( db instanceof PostgreSqlDB){
            return new PostgreSqlTransaction();
        } else if( db instanceof MongoDB){
            return new MongoTransaction();
        }

        return new MySqlTransaction();
    }

    public static Updater createUpdater(Database db){
        if( db instanceof MySqlDB){
            return new MySqlUpdater();
        } else if( db instanceof PostgreSqlDB){
            return new PostgreSqlUpdater();
        } else if( db instanceof MongoDB){
            return new MongoUpdater();
        }
        return new MySqlUpdater();
    }
}
