package com.example.designPatterns.c1_singleton.v4_synchronization2_correct_but_slow;

public class DBConnection {
    // this solution works fine in case of concurrent environment
    // but it is also overdoing sync/locking: leading to slowness [CORRECT but SLOW]
    // it will create lock on if condition for multiple threads even after a long time of first-object creation
    // but, risk of multiple-object creation was there only for first few/many threads trying to create a new object
    // can we do better?: lets try v5 onwards

    private static DBConnection instance = null;
    // null is just kept to ensure uninitialized: we can use other things also

    private DBConnection(){}

    public synchronized static DBConnection getDBConnectionObject(){
        synchronized (DBConnection.class) {
            if (instance == null) {
                instance = new DBConnection();
            }
        }
        return instance;
    }
}
