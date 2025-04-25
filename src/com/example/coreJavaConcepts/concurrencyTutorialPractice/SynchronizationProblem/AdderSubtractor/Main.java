package com.example.coreJavaConcepts.concurrencyTutorialPractice.SynchronizationProblem.AdderSubtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count res = new Count();
        Adder adder1 = new Adder(res);
        Subtractor subtractor1 = new Subtractor(res);

        Thread adderThread = new Thread(adder1);
        Thread subtractorThread = new Thread(subtractor1);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(res.value);
    }
}
