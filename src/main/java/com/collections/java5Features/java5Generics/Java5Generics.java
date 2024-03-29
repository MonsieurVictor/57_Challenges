package com.collections.java5Features.java5Generics;

import java.util.*;


        /**   Generics in Java

        The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.

        Before generics, we can store any type of objects in collection i.e. non-generic.
        Now generics, forces the java programmer to store specific type of objects.

        Advantage of Java Generics
        There are mainly 3 advantages of generics. They are as follows:

        1)	Type-safety : We can hold only a single type of objects in generics.
        It doesn’t allow to store other objects.

        2)	Type casting is not required: There is no need to typecast the object.

        Before Generics, we need to type cast.

        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);//typecasting
        After Generics, we don't need to typecast the object.

        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);

        3)	Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
        The good programming strategy says it is far better to handle the problem at compile time than runtime.

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add(32);//Compile Time Error
        Syntax to use generic collection

        ClassOrInterface<Type>

        Example to use Generics in java

        ArrayList<String>
        **/



public class Java5Generics {

    public static < E > void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }


    public static void main(String args[]){

        /** Here, we are using the ArrayList class,
        but you can use any collection class
        such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.
        **/

        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        //list.add(32);//compile time error

        String s=list.get(1);//type casting is not required
        System.out.println("element is: "+s);


        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        /**
        Example of Java Generics using Map
        **/

        // Now we are going to use map elements using generics.
        // Here, we need to pass key and value. Let us understand it by a simple example:
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

        //  Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr2=set.iterator();
        while(itr2.hasNext()){
            Map.Entry e=itr2.next();//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }

        /** Generic class
        A class that can refer to any type is known as generic class.
        Here, we are using T type parameter to create the generic class of specific type.
        Let’s see the simple example to create and use the generic class.
        **/

        TestGenerics testGenerics = new TestGenerics();
        testGenerics.tryGenericClass();

        /**  Type Parameters
        The type parameters naming conventions are important to learn generics thoroughly.
        The commonly type parameters are as follows:

        T - Type
        E - Element
        K - Key
        N - Number
        V - Value
        */

        /** Generic Method
        Like generic class, we can create generic method that can accept any type of argument.
        Let’s see a simple example of java generic method to print array elements.
        We are using here E to denote the element.
        */

        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );


        /** Wildcard in Java Generics
        The ? (question mark) symbol represents wildcard element.
        It means any type. If we write <? extends Number>,
        it means any child class of Number e.g. Integer, Float, double etc.
        Now we can call the method of Number class through any child class object.
        **/

        WildCardTest wildCardTest = new WildCardTest();
        wildCardTest.testWildCard();
    }
}