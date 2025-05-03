package com.example.designPatterns.c1_singleton.v6_synchronization4_doublecheckloading;

public class DBConnection {
    // industry standard solution for all concurrency problems in different scenarios [not just singleton Designpattern]
    // DOUBLE CHECK LOADING: [CORRECT AND FAST]
    // eg: Google Dagger, etc.

    // it can cause issues if there is requirement of SERIALIZATION and DESERIALIZATION of the Class-objects like this
    // because Serialization will convert the object into bytes
    // those bytes will then be converted to a new object at new-location into memory
    // these situations usually never occur because we usually do serialization only for data-classes/models only

    // solution for this: use enums for creating singleton class: v7

    private volatile static DBConnection singleInstance = null;
    // null is just kept to ensure uninitialized: we can use other things also

    private DBConnection(){}

    public static DBConnection getDBConnectionObject(){
        if(singleInstance == null){
            synchronized (DBConnection.class){
                if(singleInstance == null){
                    singleInstance = new DBConnection();
                }
            }
        }
        return singleInstance;
    }
}
