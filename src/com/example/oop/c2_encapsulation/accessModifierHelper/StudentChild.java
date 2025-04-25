package com.example.oop.c2_encapsulation.accessModifierHelper;

import com.example.oop.c2_encapsulation.accessModifiers.Student;

public class StudentChild extends Student {

    // i can access the protected attr of parent inside the method directly
    // and not through the separate parent-object
    void doSomething(){
        gender = "Female";
        age = 21;
        batch = "Nov 33";

//        name = "dss";   // error for default attr
//        id = 2;   // error for private attr
    }

    void doSomething2(Student s2){
        Student s3 = new Student();
//        s2.gender = "Male";
//        s3.gender = "Male";
        // Error because accessing protected attribute through the separate object of parent class
        // and not directly as a child

        // through s2 or s3, only public attr will be accessible
        s2.batch = "Dec 23 Advanced";
    }

}
