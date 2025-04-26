package com.example.designPatterns.c3_prototype_registry.v3_using_prototypes_with_registry;

public class IntelligentStudent extends Student {
    Double iq;

    public IntelligentStudent(){}

    //normal copy-constructor
    public IntelligentStudent(IntelligentStudent other){
        super(other); // fill the attributes specific to parent
        this.iq = other.iq; // fill its own attributes
    }

    // clone method
    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
