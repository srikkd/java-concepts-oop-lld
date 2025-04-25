package com.example.designPatterns.c1_singleton.v2_eagerLoading;

public class DBConnection {
    // this solution creates single object
    // with normal calling DBConnection.getDBConnectionObject() multiple times in Client
    // its achieving singleton design pattern's expected functionality even in multithreading/concurrent environment:
    // multiple threads will get the object, created at class-load time at application-startup

    // Issue with this:
    // 1. slow app-startup and
    // 2. more importantly, no possibility of parameterized constructor calling
    // if some 3rd-party service provided info needs to be entered while creating object
    // nothing will be available at class-load time

    // Eager-loading: this works fine if only empty constructor needs to be called to create object in our requirement
    // it works fine with concurrent environment also


    private static DBConnection instance = new DBConnection();

    private DBConnection(){}

    public static DBConnection getDBConnectionObject(){
        return instance;
    }
}
