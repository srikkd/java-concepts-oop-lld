package com.example.designPatterns.c3_prototype_registry.v2_using_cc_and_clone;
// so, previous version was also not accomplishing the purpose of copying: because of parent' private attr

// what can we do?
// have we learnt something in Copy-constructor about parent-child relationship,
// which allows us to create a copy of the child class object? Copy-constructor using super();
// go back to how copy-ctor of child class work:
// it first calls the copy-ctor of the parent class
// so, if we just call the copy-ctor of child inside the clone() of child,
// it will populate all attributes of parent+child
// because in copy-ctor of parent, private attr of parent can be accessed
// this, we will try in v2
public class Client {
    public static void main(String[] args) {
        Student s = new Student("Naman", 25);
        Student s1Copy = s.clone(); // it works

        Student s2 = new IntelligentStudent("Sid", 25, 80D, 90D);
        Student s2Copy = s2.clone();

        // it handles all cases of dynamic assigning of child objects at RT: verify using breakpoint

    }
}
