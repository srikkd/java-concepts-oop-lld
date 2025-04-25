package com.example.coreJavaConcepts.concurrencyTutorialPractice.SynchronizationProblem.AdderSubtractor;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i < 100001; i++){
            count.value += i;
        }
    }
}
