package com.example.coreJavaConcepts.concurrencyTutorialPractice;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(
                "This is Main Thread, created by any process/program by default with name: "+
                Thread.currentThread()
        );

        HelloPrinter helloPrinter1 = new HelloPrinter();
//        helloPrinter1.run();
        Thread t1 = new Thread(helloPrinter1);
        t1.start();

        System.out.println(
                "This print statement is also in the default \"main\" thread: "+
                Thread.currentThread()
        );
    }
}
