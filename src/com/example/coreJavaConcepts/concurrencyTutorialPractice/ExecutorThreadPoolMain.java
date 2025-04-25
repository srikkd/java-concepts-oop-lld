package com.example.coreJavaConcepts.concurrencyTutorialPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadPoolMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(4);

        for (int i = 1; i < 10001; i++){
            if(i == 501){
                System.out.println("STOP");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);

            //after creating the object of the Runnable-Task Class,
            // give the Task to the Executor/ThreadPool for thread-mgmt
            executors.execute(numberPrinter);
            Thread.sleep(1L);
        }
    }
}
