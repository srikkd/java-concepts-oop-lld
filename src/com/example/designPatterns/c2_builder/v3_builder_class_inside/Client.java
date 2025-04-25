package com.example.designPatterns.c2_builder.v2_builder_class_outside;

// this design of passing params in Hashmap has its own issues: as you can see while coding its constructor
// 1. Lot of extra type-casting to convert from Object to its appropriate DT of the attribute.
// 2. No Type-safety at CT in Client's code: client can pass Integer value in email etc.
// 3. No safety against Typos in the attribute-anmes :)in the Client's code:
//      it can lead to that attribute remaining uninitialized.
// can we use another class, instead of HashMap, to resolve above issues: that class will have same attributes as Student

// So, we are using a Builder class which solves all of above problems.
// Technically, it can be used for correctness and without much issues.
// But, the code still doesn't look beautiful:
// 2 problems:
// Client has to KNOW ABOUT BUILDER CLASS, in order to create Student object
// ALSO, CLIENT can MISUSE THE PUBLIC CONSTRUCTOR OF STUDENT BY PASSING NULL
// lets try to solve above issues in v3:

public class Client {
    public static void main(String[] args) {
//        HashMap<String, Object> studentMap1 = new HashMap<>();
//        studentMap1.put("name", "Naman");
//        studentMap1.put("email", "nama@gmail.com");
//        studentMap1.put("phoneNumber", "9878789798");

        Builder builder = new Builder();
        builder.setName("Naman");
        builder.setEmail("nama@gmail.com");
//        builder.setPsp("9878789798"); // it protects against type-safety
        builder.setPhoneNumber("9878789798");

        Student s3 = new Student(builder);
//        Student s3 = new StudentBuilder().setStudentMap(builder).createStudent();

        System.out.println(s3);

    }
}
