package com.example.designPatterns.c3_prototype_registry.v1_using_clone;

public class IntelligentStudent extends Student {
    public Double iq;
    private Double psp;

    public IntelligentStudent(){}
    public IntelligentStudent(String name, Integer age, Double iq, Double psp){
        super(name, age);
        this.iq = iq;
        this.psp = psp;
    }

    //normal copy-constructor
    public IntelligentStudent(IntelligentStudent other){
        super(other);
        this.iq = other.iq;
        this.psp = other.psp;
    }

    // clone method
    public IntelligentStudent clone(){
        IntelligentStudent s1 = new IntelligentStudent();
        s1.name = this.name;
        s1.iq = this.iq;
        s1.psp = this.psp;
        // but, we can't access private attribute of parent
//        s1.age = this.age;
        // there is no way to set that: even when we call super()
//        super(this.name, this.age);   // this.age can't be accessed

        return s1;
    }
}
