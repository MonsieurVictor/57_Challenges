package com.collections.iterationsArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * This programs represents 6 ways of iteration through the ArrayList
 * **/

public class IterationsArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Chevrolet");
        cars.add("Kia");
        cars.add("Nissan");
        cars.add("Renault");
        cars.add("Toyota");
        cars.add("Volkswagen");


        //for loop
        System.out.println("For loop:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }

        // advanced for loop
        System.out.println("\n\nAdvanced for loop:");
        for (String key : cars) {
            System.out.print(key + " ");
        }

        // while
        System.out.println("\n\nWhile loop:");
        int i = 0;
        while (i < cars.size()) {
            System.out.print(cars.get(i++) + " ");
        }

        // Iterator (supports hasNext, next, remove)
        System.out.println("\n\nIterator:");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ListIterator (supports hasNext, next, remove, hasPrevious, previous, add)
        System.out.println("\n\nListIterator:");
        ListIterator<String> listIterator = cars.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }

        // Java 8 Stream)
        System.out.println("\n\nJava 8 Stream:");
        cars.forEach((car) -> System.out.print(car + " "));
    }
}