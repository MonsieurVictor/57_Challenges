package com.collections.lambda.demoStream;

/**
 * a simple program to demonstrate the use of stream and lambda in java
 */
import java.util.*;
import java.util.stream.*;

public class DemoStream
{
    public static void main(String args[])
    {

        // create a list of integers
        List<Integer> list = Arrays.asList(2,3,4,5);
        System.out.println("List of integer: " + list);

        // demonstration of map method
        List<Integer> square = list.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println("Square the elements using collect(Collectors.toList(): " + square);

        // collect method returns a set
        Set<Integer> squareSet = list.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("Square the elements using collect(Collectors.toSet(): " + squareSet);

        // demonstration of forEach method
        System.out.print("ForEach: ");
        list.stream().map(x->x*x).forEach(y->System.out.print(y + " "));

        // demonstration of reduce method
        int even = list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println("\nReduce method: " + even);

        // create a list of String
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        System.out.println("\nList of string: " + names);


        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println("Filter by started with \"S\" : "+result);

        // demonstration of sorted method
        List<String> sortedNames =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted strings: " + sortedNames);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);


    }
}