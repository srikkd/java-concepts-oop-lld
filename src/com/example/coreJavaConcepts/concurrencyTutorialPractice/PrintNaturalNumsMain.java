package com.example.coreJavaConcepts.concurrencyTutorialPractice;

public class PrintNaturalNumsMain {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            //lambda expression impl
//            Integer j = i;
//            Runnable r = ()->{
//                System.out.println(
//                    j +
//                    ": I am a print statement from a separate thread: " +
//                    Thread.currentThread()
//                );
//            };

            //Impl not by Lambda expression: use Generic class with parameterized constructor
            NumberPrinter r = new NumberPrinter(i);

            //common thread impl
            Thread t = new Thread(r);
            t.start();
        }
    }
}
