package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollections {

    public static void main(String[] args) {

        tryLinkedList tryLinkedList = new tryLinkedList();
        tryLinkedList.execute();


        List <Person> list = new ArrayList<>();
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        Person person3 = new Person("Rabbit2");


        list.add(person1);
        list.add(person2);

        list.get(0).setName("Black");

        Object[] objects = list.toArray();
        System.out.println("objects = " + objects);

//        Person person1FromCollection = list.get(0);
//        Person person2FromCollection = list.get(1);
//        System.out.println(person1FromCollection);
//        System.out.println(person2FromCollection);


//        boolean remove = list.remove(person1);
//        System.out.println(remove);


        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()){
            Person iterPerson = iterator.next();
            System.out.println(iterPerson);
            iterator.remove();
        }

//        for(Person person: list) {
//            list.remove(person);
//        }



//        System.out.println("Index of person2 = " + list.indexOf(person2));
//        Person person = list.get(0);
//        System.out.println("person = " + person);




        System.out.println("IsEmpty =" + list.isEmpty());
        System.out.println("list.contains(person1) = " + list.contains(person1));
        System.out.println("Size = " + list.size());

    }
}
