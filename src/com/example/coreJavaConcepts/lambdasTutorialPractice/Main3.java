package com.example.coreJavaConcepts.lambdasTutorialPractice;

import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        //3 ways of instantiating an object of a Class, implementing a Functional Interface [Runnable etc.]

        //1st: instantiating an object, by impl a separate class
        DoSomething doSomething = new DoSomething();
        Thread t1 = new Thread(doSomething);
        t1.start();

        //2nd: lambda expression storing in a variable, to be used at multiple places in the scope
        Runnable r = () -> {
            System.out.println("v2: instantiating an object of a Class, implementing a Functional Interface: v2");
        };
        Thread t2 = new Thread(r);
        t2.start();
        Thread t3 = new Thread(r);
        t3.start();

        //3rd: lambda expression, to be used at RT
        Thread t4 = new Thread( () -> {
                System.out.println("v3: instantiating an object of a Class, implementing a Functional Interface: v3");
            }
        );
        t4.start();

        //Using lambda expressions for implementing SimpleCalculator interface
        SimpleCalculator addCalculator = new AdditionCalculator();
        System.out.println(addCalculator.operate(2,3));

        SimpleCalculator subtractCalculator = (a,b) -> {
            return a-b;
        };
        System.out.println(subtractCalculator.operate(2,3));

        SimpleCalculator multiplyCalculator = (a,b) -> {
            return a*b;
        };
        System.out.println(multiplyCalculator.operate(2,3));

        //lambdas for customComparator

        //Streams
        Stream<Integer> stream1 = Stream.of(1,2,3,4);
    }
}
