package com.example.designPatterns.c2_builder.v1_using_hashmap;

import java.util.HashMap;

// this design of passing params in Hashmap has its own issues: as you can see while coding its constructor
// 1. Lot of extra type-casting to convert from Object to its appropriate DT of the attribute.
// 2. No Type-safety at CT in Client's code: client can pass Integer value in email etc.
// 3. No safety against Typos in the attribute-anmes :)in the Client's code:
//      it can lead to that attribute remaining uninitialized.
// can we use another class, instead of HashMap, to resolve above issues: that class will have same attributes as Student
public class Client {
    public static void main(String[] args) {
        HashMap<String, Object> studentMap1 = new HashMap<>();
        studentMap1.put("name", "Naman");
        studentMap1.put("email", "nama@gmail.com");
        studentMap1.put("phoneNumber", "9878789798");


//        Student s1 = new Student("Naman", 24, 90D, "BML",
//                                "Dec 21", 1L, 2023, "322322324", "naman@gmail.com");

//        Student s2 = new Student("Siddharth", 28, 70D, "NIT-T",
//                                "Dec 22", 2L, null, "98727873287", "sid@gmail.com");

        Student s3 = new Student(studentMap1);

        System.out.println(s3);

    }
}
