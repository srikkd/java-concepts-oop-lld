package com.example.designPatterns.c1_singleton.v1_singleThreaded;

public class DBConnection {
    // this solution creates single object
    // with normal calling DBConnection.getDBConnectionObject() multiple times in Client
    // its achieving singleton design pattern's expected functionality in normal situations
    // but, it will fail in multithreading/concurrent environment: multiple threads may come simultaneously at if cond
    // so, we have 2 possible solution:
    // 1. Eager-loading: directly assigning the object to static instance, at class-load time [v2]
    // 2. synchronization [v3 onwards]

    private static DBConnection instance = null;
    // null is just kept to ensure uninitialized: we can use other things also

    private DBConnection(){}

    public static DBConnection getDBConnectionObject(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
}
