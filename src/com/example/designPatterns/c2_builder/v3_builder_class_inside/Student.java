package com.example.designPatterns.c2_builder.v2_builder_class_outside;

// this design of 1 Giant constructor can lead to many issues:
// 1. Lot of cross-check while filling param-values in client to ensure the correct order and data-type.
// 2. not easy to understand: eg: 26, 38: which one is age and psp etc. like confusions.
// 3. Client may end-up sending lots of null values if he doesn't want to set certain attributes: its unnecessary work.

// this design solves all of above problems of 1 giant constructor design,
// but, it has its own issues: as you can see while coding its constructor
// 1. Lot of extra type-casting to convert from Object to its appropriate DT of the attribute.
// 2. No Type-safety at CT in Client's code: client can pass Integer value in email etc.
// 3. No safety against Typos in the attribute-anmes :)in the Client's code:
//      it can lead to that attribute remaining uninitialized.
// can we use another class, instead of HashMap, to resolve above issues: that class will have same attributes as Student
// .

import java.util.HashMap;

public class Student {
    private String name;
    private Integer age;
    private Double psp;
    private String universityName;
    private String batch;
    private Long id;
    private Integer gradYear;
    private String phoneNumber;
    private String email;

    public Student(Builder builder){

        // validation starts
        if(builder.getGradYear() != null) {
            if ( builder.getGradYear() > 2022 ) {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
        }
        // validation completed

        this.name = builder.getName();

        this.age = builder.getAge();

        this.psp = builder.getPsp();

        this.universityName = builder.getUniversityName();

        this.batch = builder.getBatch();

        this.id = builder.getId();

        this.gradYear = builder.getGradYear();

        this.phoneNumber = builder.getPhoneNumber();

        this.email = builder.getEmail();
    }

}
