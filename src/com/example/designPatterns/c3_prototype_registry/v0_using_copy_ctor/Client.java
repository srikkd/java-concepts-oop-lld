package com.example.designPatterns.c3_prototype_registry.v0_using_copy_ctor;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Naman", 25);
        System.out.println(s.name);

        Student s1Copy = new Student();
        s1Copy.name = s.name;
//        s1Copy.age = s1.age;    // can't copy private attributes using v0

        Student s1 = new IntelligentStudent("Sid", 26, 80D, 90D);
        Student s2Copy = new IntelligentStudent();
//        s2Copy.iq = s.iq or s1.iq;  // can't access child class attributes here because of polymorphism
//        s2Copy.iq = ((IntelligentStudent) s1).iq;  // can't access child class attributes here because of polymorphism
//        s1 IntelligentStudent object assigned at Runtime, but type Student declared at CT: CT error for .iq access

        // so, we may need a if-else to handle this
        if( s instanceof IntelligentStudent){
            IntelligentStudent s3Copy = new IntelligentStudent();
            s3Copy.iq = ((IntelligentStudent) s).iq;
            s3Copy.name = s.name;
        } else if( s instanceof Student){
            Student s3Copy = new Student();
            s3Copy.name = s.name;
        }
        // above violates OCP and SRP

        // with normal Copy-constructor also, it violates OCP and SRP
        Student s4Copy = new Student(s);    // it works fine
//        Student s5Copy = new IntelligentStudent(s); // it gives CT-error because IS cc takes IS DT object/variable param
        // again, we will need a if-else to handle such child class polymorphism: if s instanceof IntellStu

        // Ideally, we would want that the object itself provides a method, to create a copy of that object:
        // something like clone() method: v1
    }
}
