package com.example.designPatterns.c1_singleton.v8_using_holder_idiom;

// 	• The Holder class is not loaded until someone calls getInstance(): unlike ENUM approach
//	• When Holder class is loaded, Java guarantees thread-safety (because class initialization is thread-safe in Java).
//	• No need for volatile, synchronized, etc.
//
//
//✅ Extremely fast, safe, and simple: protects against serialization issues also manually

// Initialization-on-Demand Holder Idiom, which is another clean technique before enum was popular
// [both enum and volatile were not there before 2004 when Java 1.5 came]

// only demerit: no protection when using reflection, unlike ENUM approach

//Small apps or configs → Enum Singleton is easiest.
//
//Large frameworks where lazy initialization matters → Holder pattern is better.
//
//Avoid double-checked locking unless you know you must use it and do it very carefully.

public class DBConnection {

    private DBConnection(){}

    private static class DBConnectionInnerClass{
        private static final DBConnection SINGLEINSTANCE = new DBConnection();
    }

    public static DBConnection getDBConnectionObject(){
        return DBConnectionInnerClass.SINGLEINSTANCE;
    }
}
