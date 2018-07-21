package com.collections.java5Features.java5Annotations;

/**
Java Annotation is a tag that represents the metadata i.e. attached with class, interface,
methods or fields to indicate some additional information which can be used by java compiler and JVM.
Annotations in java are used to provide additional information, so it is an alternative option for XML and java marker interfaces.
First, we will learn some built-in annotations then we will move on creating and using custom annotations.
*/

public class Java5Annotations {
    class Animal{
        void eatSomething(){System.out.println("eating something");}
    }

    class Dog extends Animal{
        @Override
        void eatsomething(){System.out.println("eating foods");}//should be eatSomething
    }

    class TestAnnotation1{
        public static void main(String args[]){
            Animal a= new Dog();
            a.eatSomething();
        }}


}
