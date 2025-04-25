package com.example.coreJavaConcepts.collectionsTutorialPractice;

import java.util.Comparator;

public class StudentComparatorByPercentage implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.percentage == o2.percentage){
            return 0;
        }

        if(o1.percentage > o2.percentage){
            return -1;
        }
        return 1;
    }
}
