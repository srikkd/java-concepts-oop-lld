package com.example.designPatterns.c1_singleton.v5_synchronization3_incorrect_but_fast;

public class DBConnection {
    // this solution doesn't work fine in case of concurrent environment
    // [INCORRECT but FAST]
    // it will create lock after multiple threads have already entered the if condition before the first-object creation
    // they all will create multiple objects one-by-one even though locking is there

    // let's try v6 onwards

    private volatile static DBConnection instance = null;   // null is just kept to ensure uninitialized: we can use other things also

    private DBConnection(){}

    public synchronized static DBConnection getDBConnectionObject(){
        if(instance == null){
            synchronized (DBConnection.class) {
                instance = new DBConnection();
            }
        }
        return instance;
    }
}
