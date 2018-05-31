package com.collections.lambda.java8Features;

import static java.lang.StrictMath.sqrt;

/**
* from http://winterbe.com/posts/2014/03/16/java-8-tutorial/
* https://habr.com/post/216431/
* */

public class Java8Features {

    class Person {
        String firstName;
        String lastName;

        Person() {}

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }



    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }

    public static void main(String[] args) {
        Java8Features app = new Java8Features();
        app.start();
    }

    private void start() {

/*
        Java 8 enables us to add non-abstract method implementations
        to interfaces by utilizing the default keyword.
        This feature is also known as Extension Methods.
*/

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        formula.calculate(100);     // 100.0
        formula.sqrt(16);           // 4.0

/*
        functional interface must contain exactly one abstract method declaration.
        Each lambda expression of that type will be matched to this abstract method.
        Since default methods are not abstract
        you're free to add default methods to your functional interface.
*/
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println("Converted from String to integer: \n(from) -> Integer.valueOf(from): " + converted);    // 123

/*
        The above example code can be further simplified by utilizing static method references
*/

        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println("(from) -> Integer.valueOf(from): " + converted2);   // 123


/*
        Java 8 enables you to pass references of methods or constructors via the :: keyword.
         The above example shows how to reference a static method.
         But we can also reference object methods:
*/

        class Something {
            String startsWith(String s) {
                return String.valueOf(s.charAt(0));
            }
        }

        Something something = new Something();
        Converter<String, String> converter3 = something::startsWith;
        String converted3 = converter3.convert("Java");
        System.out.println("Using constructor, convert Java : " + converted3);    // "J"


/*
        Let's see how the :: keyword works for constructors.
        First we define an example bean with different constructors: see "Class Person" above
        Next we specify a person factory interface to be used for creating new persons:
        see interface PersonFactory above.
        Instead of implementing the factory manually,
        we glue everything together via constructor references:
*/

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

    }
}
