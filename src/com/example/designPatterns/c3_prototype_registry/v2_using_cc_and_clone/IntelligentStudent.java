package com.example.designPatterns.c3_prototype_registry.v2_using_cc_and_clone;

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
        return new IntelligentStudent(this);
    }
}
