package com.collections.arrayList;

import java.util.*;

/**
 *  is responsible for iterating through the LinkedList
 * */

public class TryLinkedList {

    public static void execute(){
        LinkedList <Person> linkedList= new LinkedList<>();

        Person person4 = new Person("White");
        Person person5 = new Person("Rabbit");
        Person person6 = new Person("Rabbit2");

        linkedList.add(person4);
        linkedList.add(person5);
        linkedList.add(person6);

        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());

        Iterator<Person> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            Person iterListPerson = iterator.next();
            System.out.println("iterListPerson = "  + iterListPerson );
            iterator.remove();
        }

        for (Person person: linkedList) {
            iterator.next();
            linkedList.remove(person);
        }

        foo(linkedList);




    }

    private static void foo (List<Person> vectorList ){
        for (Person person: vectorList) {
            vectorList.remove(person);

        }

    }
}
