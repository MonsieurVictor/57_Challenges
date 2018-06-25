package com.collections.java8Features.java8TypeInference;

import java.util.ArrayList;
import java.util.List;

/**
    Type inference is a feature of Java which provides ability
    to compiler to look at each method invocation and corresponding declaration
    to determine the type of arguments.
    Java provides improved version of type inference in Java 8.
    the following example explains, how we can use type inference in our code:
    Here, we are creating arraylist by mentioning integer type explicitly at both side.
    The following approach is used earlier versions of Java.
*/

public class Java8TypeInference {

/** You can also create your own custom generic
 * class and methods.
 * In the following example,
 * we are creating our own generic
 * class and method.
 **/

    static class GenericClass<X> {
        X name;
        public void setName(X name){
            this.name = name;
        }
        public X getName(){
            return name;
        }
        public String genericMethod(GenericClass<String> x){
            x.setName("John");
            return x.name;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setName("Peter");
        System.out.println(genericClass.getName());

        GenericClass<String> genericClass2 = new GenericClass<>();
        genericClass2.setName("peter");
        System.out.println(genericClass2.getName());

        // New improved type inference
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));

      /**
       * example 2:
       * You can use type inference with generic classes and methods.
       * */

        // An old approach(prior to Java 7) to create a list
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        showList(list1);
        // Java 7
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
        list2.add(12);
        showList(list2);
        // Compiler infers type of ArrayList, in Java 8
        showList(new ArrayList<>());
    }

        public static void showList(List<Integer> list6){
    if(!list6.isEmpty()){
        list6.forEach(System.out::println);
    }else System.out.println("list is empty");
}



}

