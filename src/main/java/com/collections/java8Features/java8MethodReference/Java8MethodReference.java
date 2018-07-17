package com.collections.java8Features.java8MethodReference;
import java.util.function.BiFunction;

    /**
    Java provides a new feature called method reference in Java 8.
    Method reference is used to refer method of functional interface.
    It is compact and easy form of lambda expression.
    Each time when you are using lambda expression to just referring a method,
    you can replace your lambda expression with method reference.
    In this tutorial, we are explaining method reference concept in detail.
    */

interface Sayable{
    void say();
}

public class Java8MethodReference {

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        /** 1) Reference to a Static Method
        You can refer to static method defined in the class.
        Following is the syntax and example which describe the process of referring static method in Java.
        Syntax:
        ContainingClass::staticMethodName
        */

        /**
        Example 1
        In the following example,
        we have defined a functional interface
        and referring a static method
        to it's functional method say().
        */

        // Referring static method
        Sayable sayable = Java8MethodReference::saySomething;
        // Calling interface method
        sayable.say();

        /**
        Example 2
        In the following example,
        we are using predefined functional interface Runnable to refer static method.
        */

        Thread t2 = new Thread(Java8MethodReference::ThreadStatus);
        t2.start();

        Java8MethodReference java8MethodReference = new Java8MethodReference();



        /**
        Example 3
        You can also use predefined functional interface to refer methods.
        In the following example, we are using BiFunction interface
        and using it's apply() method.
        */

        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);

        /**
        Example 4
        You can also override static methods by referring methods.
        In the following example, we have defined and overloaded three add methods.
        */

        BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float>adder3 = Arithmetic::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}


