package com.example.designPatterns.c1_singleton.v7_using_enums;

//	• Java ensures that enum values are instantiated exactly once, safely across all threads.
//	• Serializable automatically — no special readResolve needed.
//	• Protection against reflection attacks (mostly — with small tricks).
//
// Very short and clean code.
// only demerit seems to be EAGER-LOADING | so, if lazy-loading is important, then avoid it else use it with free
// it was not there before

//Small apps or configs → Enum Singleton is easiest.
//
//Large frameworks where lazy initialization matters → Holder pattern is better.
//
//Avoid double-checked locking unless you know you must use it and do it very carefully.
public enum DBConnectionEnum {
    SINGLEINSTANCE;

    public void doSomething(){
        System.out.println("Doing something");
    }
}
