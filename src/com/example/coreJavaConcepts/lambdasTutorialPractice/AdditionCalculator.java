package com.example.coreJavaConcepts.lambdasTutorialPractice;

public class AdditionCalculator implements SimpleCalculator{
    @Override
    public Integer operate(Integer o1, Integer o2) {
        return o1+o2;
    }
}
