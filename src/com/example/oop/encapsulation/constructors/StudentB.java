package com.example.oop.encapsulation.constructors;

import java.util.List;

public class StudentB {
    int id;
    String name;
    int age;
    String gender = "Gender Not specified";
    List<String> batches;

    StudentB(String name, int age, List<String> batchList){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.batches);
        // above statements help us understand how constructor works
        // all the attr are set to their respective default values even at the first line of constructor
        this.name = name;
        this.age = age;
        for(String b: batchList){
//            batches.add(b);
        }
    }

}
