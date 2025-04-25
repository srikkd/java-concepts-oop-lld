package com.example.coreJavaConcepts.genericsTutorialPractice;

import java.util.List;

public class MyPair<FIRST, SECOND> {

    private FIRST first;
    private SECOND second;

    public MyPair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public void doSomethingOnFirst(FIRST greetMsg){
        System.out.println(greetMsg + "$first");
    }

    public void printGivenFirstList(List<FIRST> firstList){
        for (FIRST f: firstList) {
            System.out.println(f);
        }
    }

    public void printGivenFirstListWithWildCards(List<? extends FIRST> firstList){
        for (FIRST f: firstList) {
            System.out.println(f);
        }
    }

    public FIRST getFirst() {
        return first;
    }

    public void setFirst(FIRST first) {
        this.first = first;
    }

    public SECOND getSecond() {
        return second;
    }

    public void setSecond(SECOND second) {
        this.second = second;
    }
}
