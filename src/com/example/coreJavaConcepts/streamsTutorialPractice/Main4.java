package com.example.coreJavaConcepts.streamsTutorialPractice;

import java.util.*;
import java.util.stream.Stream;

//import static sun.swing.MenuItemLayoutHelper.max;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6);
        Set<Integer> set1 = new HashSet<>();

        Stream<Integer> stream1 = list1.stream();
//        stream1.forEach(System.out::println);

        //Q1: fill all elements from the list list1 to set1, using Streams
//        stream1.forEach(set1::add);
        list1.stream().forEach(set1::add);

        //Q2: print all even integers from the list1
        //use of filter() intermediate method: it allows to select a subset of the given Stream
        //returning a new Stream, as per the if() condition for filter
        list1.stream()
                .filter((elt) -> elt%2==0)
                .forEach(System.out::println);

        //Q3: first multiplication with 3 for each elt -> print all elt which are <10
        //use map():
        List<Integer> list2 = list1.stream()
                .map((elt) -> elt*3)
                .filter((elt) -> elt<10)
                .toList();

        //Q4: performance gains through findFirst():
        //because this function is mentioned, it will not process any elt other than 1st
        Optional<Integer> firstObject = list1.stream()
                .map((elt) -> elt*3)
                .filter((elt) -> elt<10)
                .findFirst();
//        System.out.println(firstObject.get());

        //Q5: find sum of all elts inside the list1
        // reduce()
        System.out.println(
                list1.stream().reduce(0, (sumTillNow, newElt) -> sumTillNow+newElt)
        );

        //Q6: find max in a list, using reduce
//        System.out.println(
//                list1.stream().reduce(list1.get(0), (currMax, newElt) -> Math.max(currMax, newElt))
//        );
        //behavior same as above, but different impl of reduce() with 1 param of accumulator, returning Optional<T>
        System.out.println(
                list1.stream().reduce((currMax, newElt) -> Math.max(currMax, newElt)).get()
        );

        //Q7: find count of elements in a stream []
        System.out.println(
                list1.stream().reduce(0, (currentCount, newElt) -> currentCount+1)
        );
    }
}
