package com.collections.javaGeneralFeatures.wrapperClasses;

import java.util.ArrayList;

/**
A Wrapper class is a class whose object wraps or contains a primitive data types.
When we create an object to a wrapper class, it contains a field and in this field, we can store a primitive data types.
In other words, we can wrap a primitive value into a wrapper class object.

Need of Wrapper Classes

They convert primitive data types into objects.
Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
The classes in java.util package handles only objects and hence wrapper classes help in this case also.
Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
An object is needed to support synchronization in multithreading.
*/

public class WrapperClasses {

    public static void main(String[] args) {

        /**
        * autoboxing
        **/

        char ch = 'a';;

        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));

        /**
        unboxing
        **/

        Character ch2 = 'a';

        // unboxing - Character object to primitive conversion
        char b = ch2;

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(24);

        // unboxing because get method returns an Integer object
        int num = arrayList2.get(0);

        // printing the values from primitive data types
        System.out.println(num);

        /**
        * demonstrate Wrapping and UnWrapping
        **/

        byte a3 = 1;

        // wrapping around Byte object
        Byte byteobj = new Byte(a3);

        // int data type
        int b3 = 10;

        //wrapping around Integer object
        Integer intobj = new Integer(b3);

        // float data type
        float c = 18.6f;

        // wrapping around Float object
        Float floatobj = new Float(c);

        // double data type
        double d = 250.5;

        // Wrapping around Double object
        Double doubleobj = new Double(d);

        // char data type
        char e='a';

        // wrapping around Character object

        Character charobj=e;

        //  printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);

        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types

        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}
