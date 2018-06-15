package com.collections.java8FuncInterface;
/**
 An Interface that contains exactly one abstract method is known as functional interface.
 It can have any number of default, static methods but can contain only one abstract method.
 It can also declare methods of object class.
 Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 It is a new feature in Java, which helps to achieve functional programming approach.
**/

@FunctionalInterface
 //A functional interface can have methods of object class. See in the following example.
interface sayable{
    void say(String msg);   // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class java8FuncInterface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        java8FuncInterface fie = new java8FuncInterface();
        fie.say("Hello there");
    }
}