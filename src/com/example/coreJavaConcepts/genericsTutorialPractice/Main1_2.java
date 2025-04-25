package com.example.coreJavaConcepts.genericsTutorialPractice;

import java.util.ArrayList;
import java.util.List;

public class Main1_2 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        List<Object> l3 = new ArrayList<>();

        System.out.printf(l1.getClass().getName() + System.lineSeparator());
        System.out.printf(l2.getClass().getName());
        System.out.println();

        System.out.printf(l3.getClass().getName());
    }
}
