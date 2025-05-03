package com.example.designPatterns.c1_singleton.v7_using_enums;

public class Client {
    public static void main(String[] args) {
        DBConnectionEnum dbConnectionEnum = DBConnectionEnum.SINGLEINSTANCE;
        DBConnectionEnum dbConnectionEnum1 = DBConnectionEnum.SINGLEINSTANCE;

        System.out.println(dbConnectionEnum);
        System.out.println(dbConnectionEnum1);
    }
}
