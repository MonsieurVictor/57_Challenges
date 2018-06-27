package com.collections.java8Features.java8ForEach;

import java.util.ArrayList;
import java.util.List;
/**
Java provides a new method forEach() to iterate the elements.
It is defined in Iterable and Stream interface.
It is a default method defined in the Iterable interface.
Collection classes which extends Iterable interface can use forEach loop to iterate elements.
*/

public class Java8ForEach {
    public static void main(String[] args) {

        // example 1

        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));

            // example 2
        List<String> gamesList2 = new ArrayList<String>();
        gamesList2.add("Football");
        gamesList2.add("Cricket");
        gamesList2.add("Chess");
        gamesList2.add("Hocky");
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList2.forEach(System.out::println);

      /**  Along with forEach() method, Java provides one more method forEachOrdered().
       * It is used to iterate elements in the order specified by the stream.*/

        List<String> gamesListOrdered = new ArrayList<String>();
        gamesListOrdered.add("Football");
        gamesListOrdered.add("Cricket");
        gamesListOrdered.add("Chess");
        gamesListOrdered.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression---------------");
        gamesListOrdered.stream().forEachOrdered(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesListOrdered.stream().forEachOrdered(System.out::println);
    }
}
