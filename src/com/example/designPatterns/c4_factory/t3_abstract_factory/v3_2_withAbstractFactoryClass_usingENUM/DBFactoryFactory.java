package com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM;

import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.DBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.MongoDBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.MySqlDBFactory;
import com.example.designPatterns.c4_factory.t3_abstract_factory.v3_2_withAbstractFactoryClass_usingENUM.models.DBFactory.PostgreSqlDBFactory;

// Practical Factory example in CREATING appropriate/corresponding child-class instance of abstract factory
// often Practical Factory becomes useful when Service-class is injected with the dependency using ENUM (BirdType/DBType)
// and not using main class object (Bird/DB)

// it replaced usage of createDBFactory() in DB interface/classes
public class DBFactoryFactory {
    public static DBFactory createDBFactoryUsingENUM(DBType dbType){
        return switch (dbType){
            case MYSQL -> new MySqlDBFactory();
            case POSTGRESQL -> new PostgreSqlDBFactory();
            case MONGO -> new MongoDBFactory();
        };
    }
}
