package com.example.designPatterns.c2_builder.v0_telescopic_constructors;

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
