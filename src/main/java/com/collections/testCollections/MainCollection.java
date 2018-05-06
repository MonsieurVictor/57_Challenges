package com.collections.testCollections;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {

        List collectionList = new ArrayList();
        collectionList.add("1");
        collectionList.add("2");
        collectionList.add("3");
        collectionList.set(2, "5");
        collectionList.add(1,"6");
        for (int i =0; i < collectionList.size(); i++) {
            System.out.println("collectionList " + i + " = " + collectionList.get(i));

        }
/////////////////////////////////////////////////////////////////////////
        Queue collectionQueue = new PriorityQueue();
        collectionQueue.offer("1");
        collectionQueue.offer("2");
        collectionQueue.offer("3");
        Iterator iterator = collectionQueue.iterator();
        while (iterator.hasNext()){
            System.out.println("collectionQueue" + collectionQueue.poll());
        }

/////////////////////////////////////////////////////////////////////

        Set hashSet = new HashSet(); // не упорядочивает элементы
        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("3");
        hashSet.add("1");

        for(Object o: hashSet){  // цикл на основе итератора
            System.out.println("hashSet " + o);
        }

////////////////////////////////////////////////////////////////
        Set linkedHashSet = new LinkedHashSet(); // выводит в той же посл-ти что и добалялись
        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("3");
        linkedHashSet.add("1");

        for(Object o: linkedHashSet){  // цикл на основе итератора
            System.out.println("linkedHashSet " + o);
        }

/////////////////////////////////////////////////////////////////////
        Set treeSet = new TreeSet(); // сортирует эл-ты
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("3");
        treeSet.add("1");

        for(Object o: treeSet){  // цикл на основе итератора
            System.out.println("linkedHashSet " + o);
        }

/////////////////////////////////////////////////////////////////////
        class Book {

            String nameAuthor;
            public Book(String nameAuthor) {
                this.nameAuthor = nameAuthor;
            }
            @Override
            public String toString() {
                return "Book{ " + "nameAuthor =" + nameAuthor + '\'' + '}' ;
            }




        }

        Map map = new HashMap();
        map.put("1" ,"Dan Brown");
        map.put("2" , new Book ("Karnegi"));
        map.put("3" ,"Jack London");

        System.out.println(map.get("2"));

        Set entrySet = map.entrySet();
        for(Object o: entrySet){  // цикл на основе итератора
            System.out.println("map " + o);
        }

        Set keySet = map.keySet();
        for(Object o: keySet){  // цикл на основе итератора
            System.out.println("map " + o);
        }





    }
}
