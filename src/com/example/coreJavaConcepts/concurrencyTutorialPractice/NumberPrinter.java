package com.example.coreJavaConcepts.concurrencyTutorialPractice;

public class NumberPrinter implements Runnable{
    int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(
            numberToPrint +
            ": I am a print statement from a separate thread: " +
            Thread.currentThread()
        );
    }
}
