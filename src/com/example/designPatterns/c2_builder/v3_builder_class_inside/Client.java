package com.example.designPatterns.c2_builder.v3_builder_class_inside;

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
// 1. Client has to KNOW ABOUT BUILDER CLASS, in order to create Student object
// 2. ALSO, CLIENT can MISUSE THE PUBLIC CONSTRUCTOR OF STUDENT BY PASSING NULL
// lets try to solve above issues in v3:
// v3 solves the above 2 issues:
// 1. getBuilderObject() method inside Student class itself
// 2. make Student constructor private and call it from Builder class which is inside the Student class itself
// through a build() method.

public class Client {
    public static void main(String[] args) {
        Student.Builder builder = Student.getBuilderObject();
        builder.setName("Naman");
        builder.setEmail("nama@gmail.com");
        builder.setPhoneNumber("9878789798");

        Student s3 = builder.build();

        // above code works fine with solving all problems: but, we can make it more beautiful in v4
        // can we transform the above code, something as follows:
        // Student s = Student.getBuilderObject()
        //                .setName("Naman")
        //                .setAge(24)
        //                .build();

        System.out.println(s3);

    }
}
