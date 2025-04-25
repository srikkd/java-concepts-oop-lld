package com.example.oop.c1_introToOOP;

public class Client {
    public static void main(String[] args) {
        Student naveen = new Student();
        Student Suyash = new Student();

        naveen.batch = "Nov 21 DSA";
        naveen.age = 25;

        naveen.changeBatch("Jan 22");
    }
}
