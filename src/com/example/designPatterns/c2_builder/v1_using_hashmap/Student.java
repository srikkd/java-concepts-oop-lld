package com.example.designPatterns.c2_builder.v1_using_hashmap;

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

    public Student(HashMap<String, Object> studentMap){

        // validation starts
        if(studentMap.get("gradYear") != null) {
            if ( (Integer) studentMap.get(gradYear) > 2022 ) {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
        }
        // validation completed

        if(studentMap.get("name") != null) {
            this.name = (String) studentMap.get("name");
        }
        if(studentMap.get("age") != null) {
            this.age = (Integer) studentMap.get("age");
        }
        if(studentMap.get("psp") != null) {
            this.psp = (Double) studentMap.get("psp");
        }
        if(studentMap.get("universityName") != null) {
            this.universityName = (String) studentMap.get("universityName");
        }
        if(studentMap.get("batch") != null) {
            this.batch = (String) studentMap.get("batch");
        }
        if(studentMap.get("id") != null) {
            this.id = (Long) studentMap.get("id");
        }
        if(studentMap.get("gradYear") != null) {
            this.gradYear = (Integer) studentMap.get("gradYear");
        }
        if(studentMap.get("phoneNumber") != null) {
            this.phoneNumber = (String) studentMap.get("phoneNumber");
        }
        if(studentMap.get("email") != null) {
            this.email = (String) studentMap.get("email");
        }


    }

}
