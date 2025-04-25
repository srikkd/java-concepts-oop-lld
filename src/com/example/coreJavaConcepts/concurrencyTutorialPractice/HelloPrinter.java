package com.example.coreJavaConcepts.concurrencyTutorialPractice;

public class HelloPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
        System.out.println(
                "This is Printer Thread, created by coder with name: "+
                Thread.currentThread()
        );
    }
}
