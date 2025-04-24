package com.example.oop.polymorphism.inheritanceUC;

public class Client {
    public static void main(String[] args) {
        User u = new Student();

//        u.setPsp(4.0);  // this gives CT error:
        // Compiler checks the variable by its DT and thus, relevant accessibility of the attributes/methods accordingly
        // because currently at CT, Student object is not even created and assigned to variable u
        // so, only way to check for compiler for u.setPsp() to be valid statement is by DT of u, which is User here
        // so, Compiler thinks that what all a User class object can access?

//        u.changePassword("Hello");
    }
}
