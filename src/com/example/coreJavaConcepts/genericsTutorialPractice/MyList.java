package com.example.coreJavaConcepts.genericsTutorialPractice;

public class MyList<ITEM> {
    private ITEM item;

    public MyList(ITEM item) {
        this.item = item;
    }

    public ITEM getItem() {
        return item;
    }

    public void setItem(ITEM item) {
        this.item = item;
    }
}
