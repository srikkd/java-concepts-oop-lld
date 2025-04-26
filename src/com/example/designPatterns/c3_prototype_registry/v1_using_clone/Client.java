package com.example.designPatterns.c3_prototype_registry.v1_using_clone;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Naman", 25);
        System.out.println(s.name);

        Student s1Copy = s.clone(); // it works

        Student intelligentStudent = new IntelligentStudent("Sid", 24, 80D, 90D);
        Student iSCopy = intelligentStudent.clone(); // it can't set the private attribute age of parent Student class
        // because in clone() of Child, we can't access private attributes of parent class: verify using breakpoint

        // so, this version is also not accomplishing the purpose of copying:

        // what can we do?
        // have we learnt something in Copy-constructor about parent-child relationship,
        // which allows us to create a copy of the child class object? Copy-constructor using super();
        // go back to how copy-ctor of child class work:
        // it first calls the copy-ctor of the parent class
        // so, if we just call the copy-ctor of child inside the clone() of child,
        // it will populate all attributes of parent+child
        // because in copy-ctor of parent, private attr of parent can be accessed
        // this, we will try in v2


    }
}
