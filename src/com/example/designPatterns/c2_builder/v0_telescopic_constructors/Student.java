package com.example.designPatterns.c2_builder.v0_telescopic_constructors;

// this design choice using many telescopic constructors is not good because of various reasons:
// 1. 2^N numbers of constructors are possible for N attributes
// 2. if 3 or more variables have same DT, then we can't make 2 constructors using combination of 2 of them
// 3. 1 constructor will be dependent on another constructor: change in 1 constructor will affect another in future
//  the constructor with two parameters calls the constructor that has three parameters.
//  Additionally, while we're doing this delegation, we also provide a default value for the unsupplied parameter values


public class Student {
    String name;
    Integer age;
    Double psp;
    String universityName;
    String batch;
    Long id;
    Integer gradYear;
    String phoneNumber;
    String email;

    public Student(String name,
                   Integer age,
                   Double psp,
                   String universityName,
                   String batch,
                   Long id,
                   Integer gradYear,
                   String phoneNumber,
                   String email){

        // validation starts
        if (gradYear > 2022) {
            throw new IllegalArgumentException("Grad year cannot be greater than 2022");
        }
        // validation completed

        this.name = name;
        this.age = age;
        this.psp = psp;
        this.universityName = universityName;
        this.batch = batch;
        this.id = id;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Student(){}

    public Student(String name){
        this(name, null);
    }

    public Student(String name, String email){
        this(name, email, null);
    }

//    public Student(String name, String phoneNumber){}
      //    this throws CT-error because overloading not possible here because of same signature as prev constructor

    public Student(String name, String email, String phoneNumber){
        this(name, null, null, null, null, null, null, phoneNumber, email);
    }


}
