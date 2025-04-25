package com.example.coreJavaConcepts.genericsTutorialPractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair<Double, double> coordinate1 = new Pair<Double, double>(27.1, 23.4);
//        above error because Generics can only be impl for Class DataTypes, not primitive DataTypes

        MyPair<Double, Double> coordinate1 = new MyPair<Double, Double>(27.1, 23.3);
        MyPair<Integer, String> student1 = new MyPair(1, "Sandesh");
        MyPair<String, String> message1 = new MyPair<>("Sandesh", "Hi");

        String msgContent = message1.getSecond();
//        String studentRollNum = student1.getFirst();
//        Error because of incompatible types, detected by Compiler itself before pushing code
//        here, compiler detects error, making it compile time safe
//        production RunTime errors can be avoided by using Generics

        Integer a = student1.getFirst();
//        System.out.println(a);

        //Testing the functionality of Animal and Human
        Animal a1 = new Animal();
        a1.name = "Naman";

        Animal a2 = new Animal();
        a2.name = "Amit";

        Animal a3 = new Human();
        a3.name = "ABC";

        a3.printTest();

        Human a4 = new Human();
        a4.name = "DEF";

        Human a5 = new Human();
        a5.name = "XYZ";

        MyPair<Animal, Integer> animalCounts = new MyPair<>(new Animal(), 45);

        List<Animal> animalList = List.of(a1, a2, a3, a4);
        //a4 is Human object, but it is allowed by Java as per polymorphism

        List<Human> humanList = new ArrayList<>();
//        humanList.add(a3);  //error here @CT because a3 is Animal type @CT and Human @RT
        humanList.add(a4);
        humanList.add(a5);

//        animalCounts.printGivenFirstList(humanList);
//        error because of no inheritance relation between List<Animal> and List<Human>
//        although Animal and Human have inheritance relation
//
//        solution: use wildcards to specify it explicitly that List of childClasses of Animal can be allowed
//        its not allowing multiple child classes
//        (List<? extends Animal> still can keep Human or any other child objects, but 1 at a time)
//        so Animal and Human will remain different
//        but in that part of code, the class itself or childClass collection or List can be allowed
        animalCounts.printGivenFirstListWithWildCards(humanList);
//        a3.humanChildClassSpecificMethod();

//        List<Animal> l1 = humanList;  //error because no inheritance between L<An> and L<Hu>
        List<Animal> l2 = List.copyOf(humanList);   //this is working because of shallow copy of human objects
        List<? extends Animal> l3 = humanList;  //this is working because of wildcards

        System.out.printf(String.valueOf(l3));

//        for (Human i: l3)   //error because rightnow @CT, only Animal type can be ensured/guaranteed
    }
}
