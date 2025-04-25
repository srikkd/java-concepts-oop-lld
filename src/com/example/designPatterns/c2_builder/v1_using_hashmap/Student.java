package com.example.designPatterns.c2_builder.v0_one_giant_constructor;

// this design of 1 Giant constructor can lead to many issues:
// 1. Lot of cross-check while filling param-values in client to ensure the correct order and data-type.
// 2. not easy to understand: eg: 26, 38: which one is age and psp etc. like confusions.
// 3. Client may end-up sending lots of null values if he doesn't want to set certain attributes: its unnecessary work.

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

}
