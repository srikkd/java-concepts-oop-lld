package com.example.designPatterns.c1_singleton.v0;

public class DBConnection {
    // this solution creates multiple objects
    // even with normal calling DBConnection.getDBConnectionObject() multiple times
    // its not achieving singleton design pattern's expected functionality
    // we can try to store the first-time created object and return it later without creating a new object: v1

    private DBConnection(){}

    public static DBConnection getDBConnectionObject(){
        return new DBConnection();
    }
}
