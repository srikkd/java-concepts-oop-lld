package com.example.oop.c4_polymorphism.methodOverriding;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // 1st UC: which object's method will be implemented, is decided at runtime
//        A a = getA();
//
//        a.greet();

        // 2nd UC: using inheritance UC and method-overriding features of Polymorphism
//        List<A> objList = List.of(new A(), new B(), new C(), new D(), new E());
        // could have used animals: cat/dog/cow also
//        for(A obj: objList){
//            obj.greet();;
//        }

        // 3rd UC: we want parents' impl along with some extra impl in child: use super.greet()
        D d = new D();
        d.greet();
    }

    private static A getA() {
        Scanner scanner = new Scanner(System.in);

//        // Taking String input
        System.out.print("Enter the className: ");
//        String name = scanner.nextLine();
//
//        // Taking int input
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Hello " + name + ", you are " + age + " years old!");

        String inputObjectName = scanner.nextLine();
        switch(inputObjectName){
            case "A": return new A();
            case "B": return new B();
            case "C": return new C();
            case "D": return new D();
            case "E": return new E();
        }

        scanner.close();

        return new A();
    }
}
