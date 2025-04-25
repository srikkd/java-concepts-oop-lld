package com.example.designPatterns.c1_singleton.v5_synchronization3_incorrect_but_fast;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDBConnectionObject();

        DBConnection dbConnection1 = DBConnection.getDBConnectionObject();
        
        System.out.println(dbConnection);
        System.out.println(dbConnection1);
    }
}
