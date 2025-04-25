package com.example.designPatterns.c1_singleton.v1_singleThreaded;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDBConnectionObject();

        DBConnection dbConnection1 = DBConnection.getDBConnectionObject();
        
        System.out.println(dbConnection);
        System.out.println(dbConnection1);
    }
}
