package com.collections.java5Features.java5Reflection;

/**
 * Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.
The java.lang and java.lang.reflect packages provide classes for java reflection.
Where it is used
The Reflection API is mainly used in:
IDE (Integrated Development Environment) e.g. Eclipse, MyEclipse, NetBeans etc.
Debugger
Test Tools etc.
*/

interface My{};

public class Java5Reflection {

    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }

        public static void main(String[] args) throws ClassNotFoundException {
    /**There are 3 ways to get the instance of Class class. They are as follows:
    forName() method of Class class
    getClass() method of Object class
    the .class syntax*/

//      Let's see the simple example of getClass() method.

        Simple s=new Simple();

        Java5Reflection t= new Java5Reflection();
        t.printName(s);

/////////////////////////////////////////

    /**
    If a type is available but there is no instance then it is possible
    to obtain a Class by appending ".class" to the name of the type.
    It can be used for primitive data type also.
    */
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Java5Reflection.class;
        System.out.println(c2.getName());
////////////////////////////////////////////////

        try{
            Class c3=Class.forName("Simple");
            System.out.println(c3.isInterface());

            Class c5=Class.forName("My");
            System.out.println(c5.isInterface());

        }catch(Exception e){System.out.println(e);}
    }
}

