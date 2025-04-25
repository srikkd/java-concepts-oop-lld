package com.example.coreJavaConcepts.collectionsTutorialPractice;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        //Stack is implementing Vector, which inturn is implementing List<E>
        // so, index matters in Java Stack
        Stack<Integer> stack1 = new Stack<>();
        stack1.add(13);
        stack1.add(24);
        stack1.add(46);
        stack1.add(25);

        stack1.add(1, 99);
        stack1.get(2);
        stack1.set(1, 78);
        Integer topStack = stack1.peek();

        //HashSet
        Set<PaymentStatus> set1 = new HashSet<>();
        set1.add(PaymentStatus.FAILURE);
        set1.add(PaymentStatus.AWAITING_BANK_REPLY);
        set1.add(PaymentStatus.SUCCESS);
//
//        System.out.println("Printing Set values: \n");
//        for (PaymentStatus pStatus1: set1) {
//            System.out.println(pStatus1);
//        }

        //LinkedHashSet
//        LinkedHashSet<PaymentStatus> linkedHashSet1 = new LinkedHashSet<>();
//        linkedHashSet1.add(PaymentStatus.SUCCESS);
//        linkedHashSet1.add(PaymentStatus.FAILURE);
//        System.out.println("Printing LinkedHashSet values: \n");
//        for (PaymentStatus pStatus1: linkedHashSet1) {
//            System.out.println(pStatus1);
//        }

        //EnumSet
        Set<PaymentStatus> enumSet1 = EnumSet.allOf(PaymentStatus.class);

//        System.out.println("Printing EnumSet values: \n");
//        for (PaymentStatus pStatus1: PaymentStatus.values()) {
//            System.out.println(pStatus1);
//        }

        //seeing the ordering of coder-defined class Student
        List<Student> studentsList = new ArrayList<>(
                List.of(
                    new Student(1, 22, "Naman", 35),
                    new Student(2, 25, "Amit", 70),
                    new Student(4, 23, "Mahesh", 95)
                )
        );

        //compareTo() inside Comparable<T> interface usage: natural ordering of Student class, defined in Student Class
//        Collections.sort(studentsList);
//        for (Student s1: studentsList) {
//            System.out.println(s1);
//        }

        //compare() inside Comparator<T> interface usage: inside a separate customComparator Class
        studentsList.sort(new StudentComparatorByPercentage());
        for (Student s1: studentsList) {
            System.out.println(s1);
        }

    }
}
