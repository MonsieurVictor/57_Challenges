package com.collections.java9Features;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;




    public class Java9Features {

        private interface Card {

    //    Private methods in Interfaces
    // In Java 8, we can provide method implementation in Interfaces using Default and Static methods. However we cannot create private methods in Interfaces.
    // To avoid redundant code and more re-usability, Oracle Corp is going to introduce private methods in Java SE 9 Interfaces. From Java SE 9 on-wards, we can write private and private static methods too in an interface using ‘private’ keyword.
    // These private methods are like other class private methods only, there is no difference between them.

            private Long createCardID() {
                // Method implementation goes here.
                return null;
            }

            private static void displayCardDetails() {
                // Method implementation goes here.
            }
        }

        public static void main(String[] args) throws FileNotFoundException {


//    Empty List Example

            List immutableList = List.of();
//    Non-Empty List Example

            List immutableList2 = List.of("one", "two", "three");
            System.out.println("List immutableList2 = List.of(\"one\", \"two\", \"three\"): " + immutableList2);

//    Stream API Improvements
//    In Java SE 9, Oracle Corp has added four useful new methods to java.util.Stream interface. As Stream is an interface, all those new implemented methods are default methods. Two of them are very important: dropWhile and takeWhile methods
//    If you are familiar with Scala Language or any Functions programming language, you will definitely know about these methods. These are very useful methods in writing some functional style code. Let us discuss about takeWhile utility method here.
//    This takeWhile() takes a predicate as an argument and returns a Stream of subset of the given Stream values until that Predicate returns false for the first time. If first value does NOT satisfy that Predicate, it just returns an empty Stream.

            Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> i < 5)
                    .forEach(System.out::println);
        }
//    Try With Resources Improvement
//    We know, Java SE 7 has introduced a new exception handling construct: Try-With-Resources to manage resources automatically.
//    The main goal of this new statement is “Automatic Better Resource Management”.
//    Java SE 9 is going to provide some improvements to this statement to avoid some more verbosity and improve some Readability.
//
//    Java SE 7 example

        void testARM_Before_Java9() throws IOException {
            BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
            try (BufferedReader reader2 = reader1) {
                System.out.println(reader2.readLine());
            }
        }
//    Java 9 example

        void testARM_Java9() throws IOException {
            BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
            try (reader1) {
                System.out.println(reader1.readLine());
            }
        }
    }


