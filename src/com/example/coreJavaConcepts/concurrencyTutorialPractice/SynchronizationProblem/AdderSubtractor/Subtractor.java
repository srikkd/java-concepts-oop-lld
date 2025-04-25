package com.example.coreJavaConcepts.concurrencyTutorialPractice.SynchronizationProblem.AdderSubtractor;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100001; i++){
            count.value -= i;
        }
    }
}
